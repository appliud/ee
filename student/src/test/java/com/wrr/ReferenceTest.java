package com.wrr;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {
    public static void main(String[] args) {
        // 强引用
        Object strongObj = new Object();
        System.out.println("Strong reference: " + strongObj);

        // 软引用
        SoftReference<Object> softRef = new SoftReference<>(strongObj);
        strongObj = null; // 清除强引用
        System.gc(); // 建议垃圾回收
        if (softRef.get() != null) {
            System.out.println("软引用还在.");
        } else {
            System.out.println("软引用不在.");
        }

        // 弱引用
        WeakReference<Object> weakRef = new WeakReference<>(new Object());
        System.gc(); // 建议垃圾回收
        if (weakRef.get() != null) {
            System.out.println("弱引用还在.");
        } else {
            System.out.println("弱引用不在");
        }
    }
}
