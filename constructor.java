//print student details
class STUDENT//class name
{
	int s_id;
	String s_name;
	int marks;
	void input(int x,String y,int z)//input method
	{
		s_id=x;
		s_name=y;
		marks=z;
	}
    void output()
	{
        //printing student detials
         System.out.println(s_id+"  " +s_name+"  "+marks);
	}
public static void main(String[] args)
{
    STUDENT s=new STUDENT();//object creation
   s.input(7,"SURYA",99);
   s.output();
}
}
