package week3.day1assignmt;

public class AxisBank extends BankInfo
{
	public void deposit(int b)
	{
		System.out.println(" deposit amount for FD is rs."+b);

	}
	public static void main(String[] args) 
	{
	 AxisBank a1=new AxisBank();
		a1.deposit(0);//child class(axis bank)method overrides parent class(bankinfo)method.
    }
	}
