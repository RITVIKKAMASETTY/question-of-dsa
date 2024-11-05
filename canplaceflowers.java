public class canplaceflowers
{
    public static void main(String args[])
    {
        int flowers[]={0,1,0,1,0};
        int n=0;
        for(int i=0;i<flowers.length;i++)
        {
            if(n<=0)
            {
                break;
            }
            if(i==0)
            {
                if(flowers[i]==0&&flowers[i+1]==0)
                                {n=n-1;
                                    flowers[i]=1;
                }
            }
            else if(i==flowers.length-1)
            {
                if(flowers[i]==0&&flowers[i-1]==0)
                {
                    n=n-1;
                    flowers[i]=1;
                }
            }
             else if(flowers[i]==0)
            {
                if(flowers[i-1]==0&&flowers[i+1]==0)
                {
                    n=n-1;
                    flowers[i]=1;
                }
            }
        }
        if(n==0)
        {
            System.out.println(true);
              }
        else
        {
            System.out.println(false);
        }
    }
}
