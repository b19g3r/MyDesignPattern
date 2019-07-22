package com.shane.designPattern.singleton.type03;

/**
 * ʹ�þ�̬�ڲ���ʵ�ֵ���ģʽ<br/>
 * ����������ػ���
 * @author xingxuntao
 * @version v0.1
 * @date 2019-07-22 14:55
 */

public class Singleton01 {

    private Singleton01() {
    }

    /**
     * ��̬�ڲ���, ���ʵ�ʱ��ʼ��, �̰߳�ȫ��
     */
    private static class Singleton01Instance {
        private static final Singleton01 INSTANCE = new Singleton01();
    }

    /**
     * ���ؾ�̬�ڲ���� INSTANCE
     */
    public static Singleton01 getInstance() {
        return Singleton01Instance.INSTANCE;
    }
}
