package com.shane.designPattern.singleton.type01;

/**
 * 饿汉式单例模式1, 使用静态常量<br/>
 * 线程安全,可能浪费内存
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:39
 */

public class SingletonType01 {

    /**
     * 构造器私有化
     */
    private SingletonType01() {
    }

    /**
     * 内部创建对象
     */
    private final static SingletonType01 INSTANCE = new SingletonType01();

    /**
     * 对外提供获取实例对象的方法
     * @return SingletonType01
     */
    public static SingletonType01 getInstance() {
        return INSTANCE;
    }
}
