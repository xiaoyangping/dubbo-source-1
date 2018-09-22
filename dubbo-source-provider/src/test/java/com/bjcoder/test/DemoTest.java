package com.bjcoder.test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.ProxyFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description:
 *
 * @author <a href="mailto:zhangmoujiang@songxiaocai.com">Moujiang.Zhang</a>
 * @Date Create on 2018/9/17
 * @since version1.0 Copyright 2015 SXC All Rights Reserved.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class DemoTest {

    @Test
    public void test() {
        ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
        Assert.assertNotNull(proxyFactory);
    }
}
