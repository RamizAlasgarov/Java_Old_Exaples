package Javahomework3;

import java.util.Arrays;
import java.util.Scanner;
//1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на экран в строку
//        Замените каждый элемент с нечётным индексом на ноль
//        Снова выведете массив на экран на отдельной строке

public class Example1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int[] array;
            array = new int[8];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length ; i++) {
                if(i % 2 != 0){
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));










//            int[] massiv = {5, 20, 25, 33, 36, 42, 45, 48};
//            System.out.println(Arrays.toString(massiv));
//            for (int i = 0; i < massiv.length; i++) {
//                System.out.println(i);
//                if(i%2 == 0){
//                    massiv[i] = 0;
//
//                }
//
//            }
//            System.out.println(Arrays.toString(massiv));

        }
    }

