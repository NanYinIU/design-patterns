package com.nanyin.pattern.v2.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nanyin
 * @class ManagerHandler.java
 * @description 项目经理处理实现类
 * @create 09:32 2020-03-31
 */
public class ManagerHandler extends LeaveHandler {
    private static final Logger logger = LoggerFactory.getLogger(ManagerHandler.class);

    public ManagerHandler(LeaveHandler next) {
        super(next);
    }

    @Override
    public LeaveHandler handle(LeaveRequest request) {
        // 如果人员不再项目中，流转到下一个人，如果在项目中，直接审批通过
        if(request.isInProject()){
            logger.info("项目经理对{}在{}请假审批通过！！",request.getName(),request.getDate());
        }else{
            logger.info("{} 不在项目人员中，流转到下一审批人！！",request.getName());
            // 流转到下一人
            next.handle(request);
        }
        return this;
    }
}
