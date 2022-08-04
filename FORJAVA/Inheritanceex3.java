import java.io.*;
class Inheritanceex2
{
public static void main(String args[])
{
    System.out.println("Person Detail");
    Person p1=new Person("jay","amt");
    p1.display();
    System.out.println("Student Detail");
    Student s1=new Student("yesh","amt",36,91);
    s1.display();
    System.out.println("Developer Detail");
   Developer d1=new Developer("ram","pune",500000,"developmant");
    d1.display();

}

}