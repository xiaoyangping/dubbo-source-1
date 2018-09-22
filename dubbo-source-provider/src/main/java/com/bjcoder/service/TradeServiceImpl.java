package com.bjcoder.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjcoder.TradeService;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@songxiaocai.com">Moujiang.Zhang</a>
 * @Date Create on 2018/9/17
 * @since version1.0 Copyright 2015 SXC All Rights Reserved.
 */
@Service
public class TradeServiceImpl implements TradeService {
    @Override
    public void doTrade(String msg) {
        System.out.println("msg" + msg);
    }
}
