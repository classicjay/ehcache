package com.ehcache.ehcache.controller;

import com.ehcache.ehcache.service.EhcacheService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * <p>Title: BONC -  EhcacheController</p>
 * <p>Description:  </p>
 * <p>Copyright: Copyright BONC(c) 2013 - 2025 </p>
 * <p>Company: 北京东方国信科技股份有限公司 </p>
 *
 * @author zhaojie
 * @version 1.0.0
 */
@Controller
@RequestMapping("/test")
@Api(value="ehcache",description="ceshi")
public class EhcacheController {
    @Autowired
    EhcacheService ehcacheService;

    @PostMapping("/testehcache")
    @ApiOperation("测试接口")
    public void test(@RequestBody @ApiParam(value = "monthId") String param){
        List<HashMap<String,String>> list =  ehcacheService.getTestInfo(param);
        System.out.println("list:"+list);
    }
}
