//  Name Surya
// Batch 2576
import java.util.Scanner; // import the Scanner class 
class Student {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String stdId,s_name,attendance;

    System.out.println("Enter User Id"); 
    stdId = obj.nextLine();
    
    System.out.println("Enter Student Name"); 
    s_name = obj.nextLine();   
    
    System.out.println("Enter Attendance"); 
    attendance = obj.nextLine();   
       
    System.out.println("User Id is: " + stdId);   
    System.out.println("Student Name is: " + s_name);   
    System.out.println("Attendance is: " + attendance);    
  }
}

    