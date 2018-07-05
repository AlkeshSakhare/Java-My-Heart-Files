


class InterfacePack2 extends psample.PackageSample implements interfacepack.I
{
  public  void disp()
	{
	System.out.println("disp()---:>declared in interfacepack.I----:>implemented in InterfacePack1");
	}

	public static void main(String[] args) 
	{
      interfacepack.I ob = new InterfacePack1();
	  ob.disp();

	psample.PackageSample op = 	  new InterfacePack1();
	op.show();

	}
}
