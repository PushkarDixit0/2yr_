import java.io.*;
class Box
{
private int length,breth,height;

public void dimention(int l,int b,int h)
{
    length =l;
    breth =b;
    height =h;
    
}
public void volume()
{
int v= length *breth *height;
System.out.println("Volum of the Given Box is:- "+v);
}
}