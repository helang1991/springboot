package com.helang.springboot.controller;


import com.helang.springboot.bean.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    /**
     * http://localhost:8080/doGet
     * 测试GET
     * 默认方法是GET，也可以不用写(有参数一定要对应)
     * @return
     */
    @RequestMapping(value = "doGet",method = RequestMethod.GET)
    private ApiResult testGet(String parm1){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(0);
        apiResult.setData("I'm a restful api for get");
        apiResult.setMessage("message is ok");
        return apiResult;
    }

    /**
     * http://localhost:8080/doPost
     * 测试POST
     * 客户端传的参数一定要和下面设定的参数一一对应
     * @return
     */
    @RequestMapping(value = "doPost",method = RequestMethod.POST)
    private ApiResult testPost(String parm1,String parm2){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(-1);
        apiResult.setData("I'm a restful api for post");
        apiResult.setMessage("message is not ok");
        return apiResult;
    }




}
