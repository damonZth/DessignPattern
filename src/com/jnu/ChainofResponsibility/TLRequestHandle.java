package com.jnu.ChainofResponsibility;

/**
 * Created by Damon on 2017/8/7.
 */
public class TLRequestHandle implements RequestHandle {

    RequestHandle requestHandle;

    public TLRequestHandle(RequestHandle requestHandle){
        this.requestHandle = requestHandle;
    }

    @Override
    public void handleRequest(Request request) {
        if(request instanceof LeaveRequest){
            System.out.println("要请假，项目组长审批");
        }else {
            requestHandle.handleRequest(request);
        }
    }
}
