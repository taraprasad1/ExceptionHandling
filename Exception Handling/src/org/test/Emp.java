package org.test;

public class Emp  {
	public void decide(String s) throws np.Nsal,pp.Psal,NumberFormatException
	{
		int sal=Integer.parseInt(s);
	if(sal<=0)
	{
		np.Nsal na=new np.Nsal("-ve salary");
		throw(na);
	}
	else
	{
		pp.Psal pa=new pp.Psal("+ve salary'");
	}
	}

}
