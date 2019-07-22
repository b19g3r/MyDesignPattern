package com.shane.designPattern.factory.pizza;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-22 17:26
 */

public class GreekPizza extends AbsPizza {

    @Override
    void prepare() {
        super.setName("GreekPizza");
        System.out.println(name + "is preparing");
    }
}
