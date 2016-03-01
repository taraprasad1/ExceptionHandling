package org.test.emp;
import np.Nsal;
import pp.Psal;
import org.test.Emp;

public class DemoEmp {
	public static void main(String[] args)
	{	try{
	String s=args[0];
	Emp e=new Emp();
	e.decide(s);
}
catch(Nsal na)
{
System.err.println("you have -ve salary");
}
	catch(Psal pa)
	{
		System.err.println("you have good salary");
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}}
