package cn.hbc.dubbo.provider.impl;

import cn.hbc.dubbo.remote.TestService;

/**
 * Created by KevinCui on 2018/5/8.
 */
public class TestServiceImpl implements TestService {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
