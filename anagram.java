import java.util.*;
class anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings x and y");
        String x=sc.nextLine();
        String y=sc.nextLine();
        x=x.toUpperCase();
        y=y.toUpperCase();
        String x1="",y1="";
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<x.length();j++)
            {
                char p=x.charAt(i);
                int m=(int)p;
                if(i==m)
                {
                    x1=x1+p;   
                }
            }
            for(int j=0;j<y.length();j++)
            {
                char p=y.charAt(i);
                int m=(int)p;
                if(i==m){
                    y1=y1+p;
                }
            }
            if(x1.equals(y1)==true)
            System.out.println("Anagram");
            else
            System.out.println("Not Anagram");
        }
    }
}