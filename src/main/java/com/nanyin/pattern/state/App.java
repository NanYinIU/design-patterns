package com.nanyin.pattern.state;

public class App {
    public static void main(String[] args) {
        Context context = new Context(new NormalState());
        context.requestToOpen();
        context.requestToClose();
        context.changeStageTo(new ErrorState());
        context.requestToOpen();
        context.requestToClose();
    }
}
