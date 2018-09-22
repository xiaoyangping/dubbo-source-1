package com.bjcoder.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjcoder.UserService;

import java.io.FilePermission;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@songxiaocai.com">Moujiang.Zhang</a>
 * @Date Create on 2018/9/12
 * @since version1.0 Copyright 2015 SXC All Rights Reserved.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<String> listName(String group) {
        return Arrays.asList("1", "2", "3");
    }
}
