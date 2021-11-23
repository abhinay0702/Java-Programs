import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a[]=new int[50];
        for(int i=0;i<=49;i++)
        {
        System.out.println("Enter no.'s in the array");
        a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<=49;i++)
        {
            if(a[i]>=10 && a[i]<=99)
            s=s+a[i];
        }
        int p=a[0]*a[48];
        System.out.println("The sum of two digit no. is"+s);
        System.out.println("The product of first and second last element is"+p);
        
    }
}