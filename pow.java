public class pow {
    public double myPow(double x, int n) {
        double a = 0;
        long num = n;
        if (n < 0) {
            a = 1 / pow(x, -num);
        } else {
            a = pow(x, num);
        }
        return (a);
    }

    public double pow(double x,long num)
    {
        if(num==0)
        {
            return(1);
        }
        if(num==1)
        {
            return(x);
        }
        if(num%2==0)
        {
            return(pow(x*x,num/2));
        }
        return(x*pow(x,num-1));
    }
// }Implement the power function pow(x, n) , which calculates the x raised to n i.e. xn.

// Note : In output print 6 digits places after decimal point.