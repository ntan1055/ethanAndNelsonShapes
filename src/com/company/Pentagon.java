package com.company;

public class Pentagon extends Shape
{
    private int side;
    public Pentagon(int side)
    {
        super("RPentagon");
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*(side*side);
    }
    @Override
    public double getPerimeter()
    {
        return side*5;
    }
}
