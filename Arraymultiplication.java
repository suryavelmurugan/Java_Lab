class Arraymultiplication
{
    static int array[] = {11,12,13,14};//assignmet and declaration
      
     
    static int multiply()
    {
        int mul = 1;//declaration 
        for (int i = 0; i < array.length; i++)//normal for
            mul = mul * array[i];
        return mul;
    }
     

    public static void main(String[] args)
    {
       
        System.out.println("Total Sum = "+multiply());
        }
}