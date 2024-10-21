import java.util.*;
public class aa {
   public static void main(String args[])
   {Scanner sc=new Scanner(System.in);
    ArrayList<Integer> b=new ArrayList<>();
    ArrayList<Integer> c=new ArrayList<>();
    ArrayList<Integer> q=new ArrayList<>();
    int d=sc.nextInt();
    b.add(1);
    b.add(1);
    if(d==0)
    {
        System.out.println("[1]");
    }
    else if(d==1)
    {
        System.out.println(b);
    }
    else
    {
        for(int i=2;i<=d;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    c.add(1);
                }
                else
                {
                    c.add(b.get(j-1)+b.get(j));
                }
            }
            b.clear();
            for(int n=0;n<c.size();n++)
            {
                b.add(c.get(n));
            }
            c.clear();
                }
        System.out.println(b);
    }
   } 
}