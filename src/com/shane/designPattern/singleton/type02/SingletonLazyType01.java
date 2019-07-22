package com.shane.designPattern.singleton.type02;

/**
 * 懒汉式<br/>
 * Lazy Loading,多线程不安全
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:58
 */

public class SingletonLazyType01 {

    private static SingletonLazyType01 INSTANCE;

    private SingletonLazyType01() {
    }

    private static SingletonLazyType01 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new SingletonLazyType01();
        }
        return INSTANCE;
    }
}
