import java.io.*;
class Student extends Person
{
    protected String empid,dept;
    public Student(String name,String city,int rollno,int markes)
    {
        super(name,city);
        this.rollno=rollno;
        this.markes=markes;
    }
public void display()
{
    super.display();
    System.out.println("Student roll no. is :- "+rollno);
    System.out.println("Mark of Student is :- "+markes);
}

}