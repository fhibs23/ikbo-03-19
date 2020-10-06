package ru.mirea.practice6;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        Student[] array = new Student[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new Student((int)(1+ Math.random()*10000),"",0);
        }
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(Comparable[] array){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            Comparable value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo( array[i])<0) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }

    }
}
