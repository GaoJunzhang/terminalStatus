package com.seeyoo.controller;

import com.github.pagehelper.PageInfo;
import com.seeyoo.bean.UserTgroupBean;
import com.seeyoo.model.Terminal;
import com.seeyoo.model.Tgroup;
import com.seeyoo.model.User;
import com.seeyoo.result.JsonResult;
import com.seeyoo.result.ResultCode;
import com.seeyoo.service.TerminalService;
import com.seeyoo.service.TgroupService;
import com.seeyoo.service.UserService;
import com.seeyoo.service.UserTgroupService;
import com.seeyoo.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2018/10/12.
 */
@RestController
@RequestMapping("/terminal")
public class TerminalController {
    @Autowired
    private UserService userService;

    @Autowired
    private TerminalService terminalService;

    @Autowired
    private TgroupService tgroupService;

    @Autowired
    private UserTgroupService userTgroupService;

    @Value("${termina.manager}")
    private String mamgerName;

    @RequestMapping(value = "/connectStatus",method = RequestMethod.GET)
    public Object connectStatus(@RequestParam(name = "account",required = true)String account,@RequestParam(name = "password",required = true)String password,
                                        @RequestParam(name = "page",defaultValue = "1")int page,@RequestParam(name = "size",defaultValue = "50") int size,
                                        String terminalId,String terminalname){
        JsonResult jsonResult;
        User user = userService.selectByAccount(account);
        if (user==null){
            jsonResult = new JsonResult(ResultCode.PARAMS_ERROR, "账号不存在", null);
            return jsonResult;
        }
        if (!MD5Util.getMD5String(password).toUpperCase().equals(user.getPassword())){
            jsonResult = new JsonResult(ResultCode.PARAMS_ERROR, "密码错误", null);
            return jsonResult;
        }
        List<UserTgroupBean> userTgroupBeans = userTgroupService.queryUserTgroupByUserId(user.getId());
        List<Tgroup> tgroups = null;
        PageInfo<Terminal> terminals = null;
//        if (userTgroupBeans.size()>0){
            List<String> codes = null;
            if (account.equals(mamgerName)||userTgroupBeans.size()>0){
                codes = new ArrayList<String>(userTgroupBeans.size());
                for (int j=0;j<userTgroupBeans.size();j++){
                    codes.add(userTgroupBeans.get(j).getTgroup().getCode());
                }
                tgroups = tgroupService.selectAllGroupByCodes(codes);
                List<Integer> tgroupIds = new ArrayList<Integer>(tgroups.size());
                if (tgroups.size()>0){
                    for (int i=0;i<tgroups.size();i++){
                         tgroupIds.add(tgroups.get(i).getId());
                    }
                    terminals = terminalService.selectTerminaByTgroupId(tgroupIds,page,size);
                    List<Map<String,String>> terminalStatus = new ArrayList<Map<String,String>>(terminals.getList().size());
                    if (terminals.getList().size()>0){
                        for (Terminal terminal : terminals.getList()){
                            Map<String,String> map = new HashMap<String,String>();
                            map.put("connectStatus",terminal.getConnectStatus()+"");
                            map.put("mac",terminal.getMac());
                            map.put("name",terminal.getName());
                            terminalStatus.add(map);
                        }
                        Map<String,Object> map = new HashMap<>();
                        map.put("rows",terminalStatus);
                        map.put("total",terminals.getTotal());
                        map.put("pages",terminals.getPages());
                        jsonResult = new JsonResult(ResultCode.SUCCESS, "", map);
                        return jsonResult;
                    }
                }
            }else {
                jsonResult = new JsonResult(ResultCode.UNKNOWN_ERROR, "账号未分配组织", null);
                return jsonResult;
            }
//        }
        jsonResult = new JsonResult(ResultCode.UNKNOWN_ERROR, "未知错误", null);
        return jsonResult;
    }
}
