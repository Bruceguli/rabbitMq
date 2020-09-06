package com.example.gl.rabbit;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/8/19 Time: 17:16
 * \
 */
@RestController
public class TestController
{
    @PostMapping("/getArtLabelDetailNews")
    public ApiResultNew getArtLabelDetailNews(@RequestBody ArtLabelRfidRequest request) {

            ApiResultNew apiResultNew = new ApiResultNew();
            String str =null;
            apiResultNew.setData(str);
            return apiResultNew;

    }
}
