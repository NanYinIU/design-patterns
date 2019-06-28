package com.nanyin.pattern.chain2;

public class King {
    private static RequestHandler chain;
    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(null));
    }
    private void makeRequest(Request req) {
        chain.handleRequest(req);
    }
    public static void main(String[] args) {
        King king = new King();
        king.buildChain();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
    }
}
