package com.company;

public class Main {

    public static void main(String[] args) {

        GenericArrayList<Integer> intArrayList = new GenericArrayList<>();

        intArrayList.add(1);
        intArrayList.add(15);
        intArrayList.add(66);
        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList.size());
        intArrayList.remove(0);
        System.out.println(intArrayList.size());
        intArrayList.clear();
    }
}
