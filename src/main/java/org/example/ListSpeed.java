package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class ListSpeed {

    public void test() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        Date start = new Date();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        Date end = new Date();
        System.out.println("ArrayList добавление: " + (end.getTime() - start.getTime()) + " ms");

        start = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        end = new Date();
        System.out.println("LinkedList добавление: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayList.contains(i);
        }
        end = new Date();
        System.out.println("ArrayList поиск элементов: " + (end.getTime() - start.getTime()) + " ms");

        start = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.contains(i);
        }
        end = new Date();
        System.out.println("LinkedList поиск элементов: " + (end.getTime() - start.getTime()) + " ms");


        start = new Date();
        for (int i = 9999; i >= 0; i--) {
            arrayList.remove(i);
        }
        end = new Date();
        System.out.println("ArrayList удаление: " + (end.getTime() - start.getTime()) + " ms");

        start = new Date();
        for (int i = 9999; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = new Date();
        System.out.println("LinkedList удалеие: " + (end.getTime() - start.getTime()) + " ms");

    }

}
