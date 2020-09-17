package com.example.gl.rabbit.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/9/18 Time: 7:47
 * \
 */
@Controller
@RequestMapping("/menglongdeyeController")
@Api(value = "测试接口")
public class SwaggerTestController {

    @ResponseBody
    @RequestMapping(value ="/test1", method= RequestMethod.GET)
    @ApiOperation(value="单独一个入参测试接口", notes="接口描述，例如：只能输入‘朦胧的夜’")
    @ApiImplicitParam(paramType="query", name = "blogName", value = "博客名称", required = true, dataType = "String",defaultValue = "朦胧的夜")
    public String test1(@RequestParam String blogName){
        if("朦胧的夜".equals(blogName)){
            return "对了！！！";
        }else{
            return "错了！！！";
        }

    }

    @ResponseBody
    @RequestMapping("/test2")
    @ApiOperation(value="多个入参测试接口", notes="输入用户名密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public String test2(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                        @RequestParam(value="newPassword") String newPassword){
        if(userId <= 0 || userId > 2){
            return "未知的用户";
        }
        if(StringUtils.isEmpty(password) || StringUtils.isEmpty(newPassword)){
            return "密码不能为空";
        }
        if(password.equals(newPassword)){
            return "新旧密码不能相同";
        }
        return "密码修改成功!";
    }

}

