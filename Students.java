package week3.day1assignmt;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("id is"+id);
	}
	public void getStudentInfo(int id,String name)
	{
		
		System.out.println("id is"+id+"  name is"+name);
	}
	public void getStudentInfo(String email,String phoneNumber)
	{
		System.out.println("mail address is"+email+"  phone no is"+phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(17);//overloading//
		s.getStudentInfo(17,"nithya");//overloading//
		s.getStudentInfo("abc@gmail.com", "9876543212");//overloading-2 or more methods within same class,same method name but different input args//
	}

}
