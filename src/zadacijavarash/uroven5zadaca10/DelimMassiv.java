package zadacijavarash.uroven5zadaca10;

import java.util.Arrays;

/*
Реализуй метод main(String[]), который делит массив array на два подмассива
 и заполняет ими двумерный массив result. Если длина массива нечетная,
 то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.

Требования:
•	Реализуй метод main(String[]) согласно условию.
 */
public class DelimMassiv {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

//        System.out.println(Arrays.deepToString(result));
    }
}
//    int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//        result[0] = Arrays.copyOfRange(array, 0, firstPart);
//                result[1] = Arrays.copyOfRange(array, firstPart, array.length);
//                System.out.println(Arrays.deepToString(result));   x,z