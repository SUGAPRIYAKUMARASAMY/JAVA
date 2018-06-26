import java.util.*;
import java.lang.*;
import java.io.*;
 class employee{
	int rollno;
	String name;
	String dpmnt;
	int salary;
	int age;
	String address;
public void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the rollno:");
		rollno=Integer.parseInt(s.nextLine());
		System.out.println("enter the name:");
		name=s.nextLine();
		System.out.println("enter the dpmnt:");
		dpmnt=s.nextLine();
		System.out.println("enter the salary:");
		salary=Float.parsefloat(s.nextLine());
		System.out.println("enter the age:");
		age=Integer.parseInt(s.nextLine());
		System.out.println("enter the address:");
		address=s.nextLine();
	}
	public void printdata()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("dpmnt:"+dpmnt);
		System.out.println("salary:"+salary);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}
}
	public class display
	{
		public static void main(String args[])
		{
	 employee[] e=new employee[2];
	 for(int i=0;i<e.length;i++)
	 {
	 	e[i]=new employee();
	 	e[i].getdata();
	}
	int n;
	Scanner a=new Scanner(System.in);
	System.out.println("enter the rollno:");
	n=Integer.parseInt(a.nextLine());
	for(int j=0;j<e.length;j++)
	{
	if(e[j].rollno==n)
	e[j].printdata();
	}
	}
	}
	
