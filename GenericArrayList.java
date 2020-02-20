package com.company;

public class GenericArrayList <E> {

    private Object[] array = new Object[0];

    public void add(E e) {
        Object[] array2 = new Object[array.length +1];
        for(int i = 0; i < array.length; i++ ){
            array2[i] = array[i];
        }
        array2[array2.length - 1] = e;
        array = array2;
    }

    public void remove(int index){
        Object[] array2 = new Object[array.length - 1];

        int index2 = 0;

        for (int i = 0; i < array.length; i++){
            if(i == index){
                array2[index2] = array[i];
                index2++;
            }
        }
        array = array2;
    }

    public E get(int index) {
        E e = null;
        for(int i = 0; i < array.length; i++){
            if(i == index){
                e = (E)array[i];
            }
        }
        return e;
    }

    public void clear() {
        array = new Object[0];
    }

    public int size() {
        return array.length;
    }
}
