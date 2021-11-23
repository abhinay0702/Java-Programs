import java.io.*;
class abhinay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int choice =sc.nextInt();
        switch(choice)
        {case 1:
        int sum=a+b;
        System.out.println(sum);
        break;
        case 2 :int diff=a-b;
        System.out.println(diff);
        break;
        case 3:int mul=a*b;
        System.out.println(mul);
        break;
        case 4:int div=a\b;
        System.out.println(div);
        break;
        case 5:int mod=a%b;
        System.out.println(mod);
        break;
        default:
        System.out.println("INAVLID CHOICE");
        
        }
        }
}