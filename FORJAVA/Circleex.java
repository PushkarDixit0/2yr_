import java.io.*;
class Circleex
{
    public static void main(String args[])
    {
        Circle c1=new Circle(5);
        Circle c2=new Circle(12);
        Circle c3=new Circle(c1);
    
        c1.area();
        c2.area();
        c3.area();  
    }
}