package com.nanyin.pattern.template;

public class GetClient extends HttpServletTemplate {
    @Override
    protected void doGet() {
        System.out.println("this is my get methods!");
    }
}
