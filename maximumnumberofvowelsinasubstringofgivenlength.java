public class maximumnumberofvowelsinasubstringofgivenlength {
        public static void main(String args[])
        {
            String s="abciiidef";
            int n=3;
            int noofvowels=0,max=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                noofvowels=noofvowels+1;
            }  
        }
        for(int i=n;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                noofvowels=noofvowels+1;
            }
            if(s.charAt(i-n)=='a'||s.charAt(i-n)=='e'||s.charAt(i-n)=='i'||s.charAt(i-n)=='o'||s.charAt(i-n)=='u')
            {
                noofvowels=noofvowels-1;
            }
            max=Math.max(noofvowels,max);
        }
        System.out.println(max);}}