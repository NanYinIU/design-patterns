package com.nanyin.pattern.template;

public abstract class HttpServletTemplate {

    public void service(HttpRequestMethod method){
        if(method.equals(HttpRequestMethod.METHOD_GET)){
            System.out.println("so something 1");
            doGet();
            System.out.println("so something 2");
        }else if(method.equals(HttpRequestMethod.METHOD_POST)){
            doPost();
        }else {
            System.out.println("do nothing!");
        }
    }
    protected void doGet(){};

    protected void doPost(){};
}
