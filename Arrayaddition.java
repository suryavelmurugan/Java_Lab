class Arrayaddition
{
   
        static int array[] = {11,12,13,14};//assignmet and declaration
      
     
     static int add() 
     {
         int add = 0; 
         int i;
       
         
         for (i = 0; i < array.length; i++)//normal for
            add +=  array[i];
       
         return add;
     }
     public static void main(String[] args) 
     
     
     {
         System.out.println("Total sum = " + add());
        }
 }