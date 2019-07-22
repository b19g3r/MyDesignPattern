package com.shane.designPattern.singleton.type04;

/**
 * 利用枚举实现单例
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-22 15:05
 */

enum Singleton01 {

    INSTANCE;

    public void sayHello() {
        System.out.println("ok");
    }

}

