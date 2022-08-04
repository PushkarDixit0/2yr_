
class Student
{ 
    String name;
int rollno,marks;
void display()
{
System.out.println("Name of Student = "+name);
System.out.println("Roll no. of Student = "+rollno);
System.out.println("Markes of Student = "+marks);
}
void parcentage()
{
double p=(marks*100)/100;
System.out.println("Parcentage of Student = "+p+"%");

}

}