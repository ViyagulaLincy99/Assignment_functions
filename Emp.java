//create a class of Employee
public class Emp {
	int empid;
	String empname;
	double empsalary;
	String empdesg;
	public void read()
	{
		empid=101;
		empname="lincy";
		empsalary=15000;
		empdesg="Associate";
	}
	public void print()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empdesg);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp a1,a2,a3;//createing a reference variable of a1,a2,a3
a1=new Emp();//allocating a memory of a1
a2=new Emp();//allocating a memory of a2
a3=new Emp();//allocating a memory of a3
a1.read();//calling the method of read
a1.print();//calling the method to print
a2.read();
a2.print();
a3.read();
a3.print();



}

}
