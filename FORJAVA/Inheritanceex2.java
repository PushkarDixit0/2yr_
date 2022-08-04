import java.io.*;
class Inheritanceex2
{
public static void main(String args[])
{
    System.out.println("Person Detail");
    Person p1=new Person("jay","amt");
    p1.display();
    System.out.println("Employee Detail");
    Employee e1=new Employee("yesh","amt","22e1","testing");
    e1.display();
    System.out.println("Profesor Detail");
    Profesor k1=new Profesor("ram","pune","22k1","developmant",550000,5);
    k1.display();

}

}