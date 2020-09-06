package com.example.gl.rabbit.redis;

import com.example.gl.rabbit.lehuBase.ApiResult;
import com.example.gl.rabbit.lehuBase.BaseController;
import com.example.gl.rabbit.redis.entity.Company;
import com.example.gl.rabbit.redis.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/8/26 Time: 18:32
 * \
 */
@RestController
@RequestMapping("/redis")
public class RedisController extends BaseController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("studyOne")
    private ApiResult getCompany(@RequestParam("projectId") String projectId,HttpServletRequest request){
        List<Company> company =companyService.getCompany(projectId,request);
        return success(company);
    }
}
