package com.example.peer3.hystrix;

import com.example.peer3.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chuankai
 * @since 2018/11/30
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name + "this message send fail (发送失败)";

    }

}
