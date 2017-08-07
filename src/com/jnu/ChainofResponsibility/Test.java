package com.jnu.ChainofResponsibility;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);

        Request request = new DimissionRequest();
        tl.handleRequest(request);

        request = new AddMoneyRequest();
        tl.handleRequest(request);

        request = new DimissionRequest();
        pm.handleRequest(request);
    }
}
