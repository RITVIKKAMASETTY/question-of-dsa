import java.util.*;
public class isanagram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int e=0;
        if(c.length==d.length)
        {
            for(int i=0;i<c.length;i++)
            {
                if(c[i]!=d[i])
                {
                    e=100;
                    break;
                }
            }
            if(e==100)
            {
                System.out.println("false");
            }
            else
            {
                System.out.println("true");
            }
        }
    }
}
