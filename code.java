import java.util.*;
class code 
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A SENTENCE");
        String x=sc.nextLine();
        int l=x.length();
        for(int i=0;i<l;i++)
        {
            char ch=x.charAt(i);
            int m=(int)ch;
            m=m+3;
            if(m>90)
            m=m-26;
            ch=(char)m;
            System.out.println(ch);
        }

    }
}