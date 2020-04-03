package com.nanyin.pattern.v2.chain;

import com.nanyin.pattern.chain2.Request;

/**
 * @author nanyin
 * @class Client.java
 * @description 请假场景： 如果人员在项目中，需要项目经理审批，如果不再项目中，需要部门leader审批
 * @create 09:32 2020-03-31
 */
public class Client {
    // 添加请求
    private LeaveRequest request = new LeaveRequest("zhangsan","0919",true);
    private LeaveRequest request2 = new LeaveRequest("lisi","0929",false);
    // 设置责任链
    private LeaveHandler manageHandler = new ManagerHandler(new LeaderHandler(null));
    public static void main(String[] args) {
        Client client = new Client();
        // 责任链处理
        client.manageHandler.handle(client.request).handle(client.request2);
    }
}
