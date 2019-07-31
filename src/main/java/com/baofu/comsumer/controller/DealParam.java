package com.baofu.comsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.baofu.provider.api.IDealParam;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xianchao
 * @version 1.0.0
 * @description
 * @date 19:00 2019/7/30
 **/
@RestController
public class DealParam implements IDealParam {

    @Reference
    public IDealParam iDealParam;

    @GetMapping("/dealParam")
    @Override
    public String dealParam(@RequestParam(value="str",required = false,defaultValue = "1") String str) {

        return iDealParam.dealParam(str);
    }
}
