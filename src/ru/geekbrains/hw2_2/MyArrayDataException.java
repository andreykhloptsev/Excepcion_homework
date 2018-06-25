package ru.geekbrains.hw2_2;


public class MyArrayDataException extends RuntimeException {
 private int row, column;

    public MyArrayDataException(int row, int column) {
        super("Array data Exception on "+ (row+1)+" "+(column+1));
        this.row = row;
        this.column = column;
    }
}
