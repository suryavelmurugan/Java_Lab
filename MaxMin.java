public class MaxMin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println("Enter values"); //Any three values
        int min=Integer.MAX_VALUE; //Finding Maximum value
        int max=Integer.MIN_VALUE; // Finding Minimum value
        for(int i=0; i<=3; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<min) {
                min=arr[i];
            }
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum value = "+max);
        System.out.println("Minimum value = "+min);


    }
}
