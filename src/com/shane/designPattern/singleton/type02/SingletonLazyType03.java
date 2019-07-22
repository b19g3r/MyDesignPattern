package com.shane.designPattern.singleton.type02;

/**
 * 懒汉式<br/>
 * Lazy Loading<br/>
 * Double Check, 解决了线程安全问题和效率问题;
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:58
 */

public class SingletonLazyType03 {

    /**
     * 加上 volatile 关键字
     */
    private static volatile SingletonLazyType03 INSTANCE;

    private SingletonLazyType03() {
    }

    /**
     * 线程安全的懒汉式,加入了
     */
    private static SingletonLazyType03 getInstance() {
            if (null == INSTANCE) {
                synchronized (SingletonLazyType03.class) {
                    if (null == INSTANCE) {
                        INSTANCE = new SingletonLazyType03();
                    }
                }
            }
        return INSTANCE;
    }
}
