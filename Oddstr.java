import java.io.*;
import java.util.Scanner;
public class Oddevenstr {
    public static void main(String args[])
    {int i;
        Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int j;
    int len=str.length();
    char p[]=str.toCharArray();
    char temp;
    for (i=0,j=i+1;i<p.length&&j<p.length;i=i+2,j=j+2)
        {
        temp=p[i];
        p[i]=p[j];
        p[j]=temp;
        }
    for(char k:p)
    {
         System.out.print(k);
    }
       
    
    } }

