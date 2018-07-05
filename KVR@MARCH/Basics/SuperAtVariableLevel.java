//Stage3 : Specific class

import empl.Emp;
import pval.PvalException;
import nval.NvalException;


class  EmpExecute
{
	public static void main(String[] args) 
	{
		try
		{
		Emp e = new Emp();
		e.salary(args[0]);
		System.out.println("Hello World!");
		}
		catch (NvalException ne)
		{
			System.out.println("NVAl: From Catch");
		}

			catch (PvalException pe)
		{
			System.out.println("PVAl: From Catch");
		}

		catch (ArrayIndexOutOfBoundsException ao)
		{
			System.out.println("");
			System.out.println("ArrayIndexOutOfBoundsException : Enter 2 valus at CMD_LINE");
		}