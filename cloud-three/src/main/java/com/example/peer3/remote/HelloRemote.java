package com.example.peer3.remote;

import com.example.peer3.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chuankai
 * @since 2018/11/28
 */
//在HelloRemote类添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


}
