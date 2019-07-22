package com.shane.designPattern.singleton.type01;

/**
 * 饿汉式单例模式2, 使用静态常量,在静态代码块中创建对象
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-19 16:39
 */

public class SingletonType02 {

    /**
     * 构造器私有化
     */
    private SingletonType02() {
    }


    private final static SingletonType02 INSTANCE;

    /*
     * 静态代码块中创建对象
     */
    static {
        INSTANCE = new SingletonType02();
    }

    /**
     * 对外提供获取实例对象的方法
     * @return SingletonType01
     */
    public static SingletonType02 getInstance() {
        return INSTANCE;
    }
}
