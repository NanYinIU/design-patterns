package com.nanyin.pattern.template;

public class PostClient extends HttpServletTemplate {
    @Override
    protected void doGet() {
        this.doPost();
    }

    @Override
    protected void doPost() {
        System.out.println("this is my post methods!");
    }
}
