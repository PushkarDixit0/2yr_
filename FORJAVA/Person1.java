import java.io.*;
class Person
{
    protected String name , city;
    public Person(String name,String city)
    {
        this.name=name;
        this.city=city;
    }
public void display()
{
    System.out.println("Name is :- "+name);
    System.out.println("City is:- "+city);
}
}