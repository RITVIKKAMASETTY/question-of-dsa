import java.util.*;
public class duplicateinteger
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a[]=new int[b];
        Arrays.sort(a);
        int q=0;
        for(int i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
        }
        int p[]=new int[a[b-1]+1];
        for(int i=0;i<b;i++)
        {
            p[a[i]]+=1;
            if(p[a[i]]>1)
            {
                q=100;
            }
        }
        if(q==100)
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}