import java.util.*;
public class twointegersum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(b[i]+b[j]==c)
                {
                    System.out.println("["+i+","+j+"]");
                    break;
                }
            }
        }
    }
}