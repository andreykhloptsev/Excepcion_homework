package ru.geekbrains.hw2_2;

import java.util.Random;

public class Main {

    static int ARR_LENGTH=4;
    static Random r = new Random();

    public static void main(String[] args) {
        //чтобы создать массив другого размера
        //  String[][] arr = new String[ARR_LENGTH+1][ARR_LENGTH];
        String[][] arr = new String[ARR_LENGTH][ARR_LENGTH];
        FillArray(arr);
        //чтобы вызвать ошибку данных
        //arr[2][2]="error";
        PrintArray(arr);
        SumElements(arr);
    }

    static void  FillArray(String[][] array)
    {
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                array[i][j]=Integer.toString(r.nextInt(15));
            }
        }
    }

    static void  PrintArray(String[][] array)
    {
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void SumElements(String[][] array)
    {
        int sum=0;
        if (array.length!=ARR_LENGTH || array[0].length!=ARR_LENGTH)
            throw new MyArraySizeException();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[0].length ; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e)
                {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println("Sum = "+sum);
    }
}
