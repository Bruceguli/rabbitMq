package com.example.gl.rabbit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 欢迎关注公众号:大立Style
 * \* 希望对小伙伴有帮助,感谢支持,有疑问或者不足欢迎留言谢谢!
 * \* User: 大立Style
 * \* Date: 2020/8/19 Time: 17:16
 * \
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.gl.rabbit.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试Swagger项目")
                .description("ceshi")
                .termsOfServiceUrl("https://blog.csdn.net/ityqing")
                .contact("lcl")
                .version("1.0")
                .build();
    }



//    @Api：用在类上，说明该类的作用。
//
//    @ApiOperation：注解来给API增加方法说明。
//
//    @ApiImplicitParams : 用在方法上包含一组参数说明。
//
//    @ApiImplicitParam：用来注解来给方法入参增加说明。
//
//    @ApiResponses：用于表示一组响应
//
//    @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
//
//    l   code：数字，例如400
//
//    l   message：信息，例如"请求参数没填好"
//
//    l   response：抛出异常的类
//
//    @ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam注解进行描述的时候）
//
//    l   @ApiModelProperty：描述一个model的属性
//
//
//
//    注意：@ApiImplicitParam的参数说明：

}