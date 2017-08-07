package com.jnu.ChainofResponsibility;

/**
 * Created by Damon on 2017/8/7.
 */
public interface RequestHandle {
    void handleRequest(Request request);
}
