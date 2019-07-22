package com.shane.designPattern.singleton.type03;

/**
 * 使用静态内部类实现单例模式<br/>
 * 利用了类加载机制
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-22 14:55
 */

public class Singleton01 {

    private Singleton01() {
    }

    /**
     * 静态内部类, 访问到时初始化, 线程安全的
     */
    private static class Singleton01Instance {
        private static final Singleton01 INSTANCE = new Singleton01();
    }

    /**
     * 返回静态内部类的 INSTANCE
     */
    public static Singleton01 getInstance() {
        return Singleton01Instance.INSTANCE;
    }
}
