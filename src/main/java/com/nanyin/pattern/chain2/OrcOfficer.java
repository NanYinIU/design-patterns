package com.nanyin.pattern.chain2;

public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }
    @Override
    public String toString() {
        return "Orc officer";
    }
}
