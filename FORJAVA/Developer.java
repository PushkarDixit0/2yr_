import java.io.*;
class Developer extends Person
{
protected int salary; String dept;
public Developer(String name,String city,int salary,String dept)
{
  super(name,city);
  this.salary=salary;
  this.dept=dept;

}
public void display()
{
    super.display();
    System.out.println("Salary is:- "+salary);
    System.out.println("Department is :- "+dept );
}
}