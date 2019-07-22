package com.shane.designPattern.factory.pizza;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-22 17:19
 */

public abstract class AbsPizza {

    protected String name;

    abstract void prepare();

    void bake() {
        System.out.println(name + " is baking");
    }

    void box() {
        System.out.println(name + " is boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
