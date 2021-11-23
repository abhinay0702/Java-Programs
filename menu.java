import java.util.*;
class menu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Check whether a no. is a deficeint no. or not");
        System.out.println("2.Print the pattern");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
       switch(ch)
        {
            case 1:System.out.println("Enter a no.");
            int x=sc.nextInt();
            int s=0;
            for(int i=1;i<x;i++)
            {
                if(x%i==0)
                {
                    s=s+i;
                }
            }
            if(s!=x)
            System.out.println(x+" is a deficient no.");
            else
            System.out.println(x+" is not a defiecient no.");
            break;
            case 2:for(int j=0;j<=9;j++)
            {
                for(int k=j;k>=1;k--)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            break;
            default:System.out.println("Invalid choice");
        }
    }
}