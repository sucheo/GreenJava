package com.green.java.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x =10, y=20, tmp = 0;

        System.out.printf("x: %d, y: %d \n", x, y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.printf("x: %d, y: %d,tmp:%d \n",x,y,tmp);
    }
}
