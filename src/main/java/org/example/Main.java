package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = rand ();
        int n = most_bit ();
        System.out.println(i);
        System.out.println(n);
        System.out.println(Arrays.toString(mx_num(i,n)));
        System.out.println(Arrays.toString(mn_num(i,n)));
    }


    public static int rand () {      // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random random = new Random();
        int i = random.nextInt(0, 2000);
        return i;
    }

    public static int most_bit () {  //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        Random random = new Random();
        int n = random.nextInt(0, 2000);
        String binary = Integer.toBinaryString(n);
        return binary.length();
    }
    public static int[] mx_num (int i, int n) { //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = new int[Short.MAX_VALUE];
        int couter = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[couter++] = j;
            }
        }
        return m1;
    }
    public static int[] mn_num (int i, int n) { //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = new int[Short.MAX_VALUE];
        int couter = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2[couter++] = j;
            }
        }
        return m2;
    }
}