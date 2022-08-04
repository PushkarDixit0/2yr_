import java.io.*;
class Circle
{
    private int radius;
public Circle(int r)
{
    radius=r;
}
public void area()
{
    double a=3.14*radius * radius;
    
    System.out.println("area of circle is=  "+a);
}
public Circle(Circle z)
{
    radius=z.radius;
}
}