package com.company;

public class eTriangle extends Shape
{
    private int height;
    private int width;
    public eTriangle(int height, int width)
    {
        super("eTriangle");
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() { return (height *width)/2; }
    @Override
    public double getPerimeter()
    {
        return (width*3);
    }
}