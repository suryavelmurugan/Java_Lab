public class Fibo {
    public static void main(String[] args)
    {
         //  initializing value upto 10
        int count=10;
        int n=0,m=1,fibo;
        System.out.println(n+"\n"+m);


        //  Performing Fibonacci series using for loop
        for(int i=2;i<count;i++)
        {  
            fibo=n+m;
            System.out.println(fibo);
            n=m;
            m=fibo;


        }
    }

    
}
