public class AddN {
    public static void main(String[] args)
    {
        //  initializing value upto 10
        int  count=10; 
        // 
        int n=1;
        // let assume n=1 to get 
        // performing for loop for until count
        for (int i=1;i<=count;i++) 
        { 
            // printing value n with space using \t 

            System.out.print(n+"\t") ;
            n=n+n;
            
        }
    }
}
