package annotation.service.impl;

import annotation.annotation.RpcService;
import annotation.service.HelloService;


@RpcService("HelloServicebb")
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello! " + name;
    }
    
    public void test(){
    	System.out.println("test");
    }
}
