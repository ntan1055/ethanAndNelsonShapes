package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new eTriangle(5, 5);
        Shape shape3 = new Circle(5);

        Shape shape4 = new Pentagon(5);
        System.out.println(shape4);
        System.out.println("My Perimeter is: " + shape4.getPerimeter());
        System.out.println("My Area is " + shape4.getArea());

        Shape[] shapes = {shape1, shape2, shape3};

        for (Shape cur: shapes)
        {
            System.out.println(cur);
            System.out.println("My Area is " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }
    }
}
