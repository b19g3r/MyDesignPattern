package com.shane.designPattern.singleton;

import com.shane.designPattern.singleton.type01.SingletonType01;

/**
 * 单例模式1: 饿汉式
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:37
 */

public class Singleton01 {

    public static void main(String[] args) {
        SingletonType01 singletonType01 = SingletonType01.getInstance();
        SingletonType01 singletonType02 = SingletonType01.getInstance();
    }
}