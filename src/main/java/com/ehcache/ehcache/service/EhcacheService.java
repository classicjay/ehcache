package com.ehcache.ehcache.service;

import com.ehcache.ehcache.mapper.EhcacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;

/**
 * <p>Title: BONC -  EhcacheService</p>
 * <p>Description:  </p>
 * <p>Copyright: Copyright BONC(c) 2013 - 2025 </p>
 * <p>Company: 北京东方国信科技股份有限公司 </p>
 *
 * @author zhaojie
 * @version 1.0.0
 */
@Service
public class EhcacheService {

    @Autowired
    EhcacheMapper ehcacheMapper;

    @Cacheable(cacheNames = "getTestInfo" ,key = "#param")
    public List<HashMap<String,String>> getTestInfo(String param){
        System.out.println("走了缓存");
        return ehcacheMapper.getData(param);
    }
}
