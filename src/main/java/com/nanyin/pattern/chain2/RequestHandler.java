package com.nanyin.pattern.chain2;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println("1."+req.getRequestType() + " 2."+req.getRequestDescription());
    }

    @Override
    public abstract String toString();
}
