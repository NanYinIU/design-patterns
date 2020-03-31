package com.nanyin.pattern.v2.chain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nanyin
 * @class LeaderHandler.java
 * @description LeaveHandler的实现类，实现handler
 * @create 09:29 2020-03-31
 */
public class LeaderHandler extends LeaveHandler {
private static final Logger logger = LoggerFactory.getLogger(LeaderHandler.class);
    public LeaderHandler(LeaveHandler next) {
        super(next);
    }

    @Override
    public LeaveHandler handle(LeaveRequest request) {
        logger.info("部门主管对{}在{}请假审批通过！！",request.getName(),request.getDate());
        return this;
    }
}
