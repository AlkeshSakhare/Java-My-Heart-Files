
 class Pkg implements tp.ITest
{

	public void show()
	{
		System.out.println("Show is implemented");
	}
}



class ITestPkg  
{
	public static void main(String[] args) 
	{
	tp.ITest ob = new Pkg();
	ob.show();
	}
}
