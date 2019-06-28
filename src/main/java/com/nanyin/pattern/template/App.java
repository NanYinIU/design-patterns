package com.nanyin.pattern.template;

public class App {
    public static void main(String[] args) {
        PostClient post = new PostClient();
        post.service(HttpRequestMethod.METHOD_POST);
        GetClient get = new GetClient();
        get.service(HttpRequestMethod.METHOD_GET);
        get.service(HttpRequestMethod.METHOD_POST);
    }
}
