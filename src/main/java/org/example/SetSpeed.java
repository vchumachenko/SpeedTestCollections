package org.example;

import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class SetSpeed {
    public void test() {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        Date start = new Date();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        Date end = new Date();
        System.out.println("HashSet добавление: " + (end.getTime() - start.getTime()) + " ms");

        start = new Date();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        end = new Date();
        System.out.println("TreeSet добавление: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 0; i < 10000; i++) {
            hashSet.contains(i);
        }
        end = new Date();
        System.out.println("HashSet поиск элементов: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 0; i < 10000; i++) {
            treeSet.contains(i);
        }
        end = new Date();
        System.out.println("TreeSet поиск элементов: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 9999; i >= 0; i--) {
            hashSet.remove(i);
        }
        end = new Date();
        System.out.println("HashSet удаление: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 9999; i >= 0; i--) {
            treeSet.remove(i);
        }
        end = new Date();
        System.out.println("TreeSet удаление: " + (end.getTime() - start.getTime()) + " ms");

    }

}

