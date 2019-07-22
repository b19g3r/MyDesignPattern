package com.shane.designPattern.singleton.type02;

/**
 * 懒汉式<br/>
 * Lazy Loading<br/>
 * 解决了线程安全问题,但是效率降低: 每次访问 getInstance() 都要同步,而这个方法只在 INSTANCE 为 NULL 的时候同步就可以了,
 * 之后直接返回 INSTANCE;
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:58
 */

public class SingletonLazyType02 {

    private static SingletonLazyType02 INSTANCE;

    private SingletonLazyType02() {
    }

    /**
     * 线程安全的懒汉式,加入了 synchronized 关键字
     */
    private static synchronized SingletonLazyType02 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new SingletonLazyType02();
        }
        return INSTANCE;
    }
}
