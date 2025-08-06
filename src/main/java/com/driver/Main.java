package com.driver;

public class Main {
    Product p = new Product();

    int x = 10;
    int y = 9;
    int z = 8;
    double a = 7.5;
    double b = 3.4;

    int task1 = p.product(x,y);
    int task2 = p.product(x,y,z);
    double task3 = p.product(a,b);
}