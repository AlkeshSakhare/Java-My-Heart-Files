import interfacepack.I;
import psample.PackageSample;


class InterfacePack1 extends PackageSample implements I
{
  public  void disp()
	{
	System.out.println("disp()---:>declared in interfacepack.I----:>implemented in InterfacePack1");
	}

	public static void main(String[] args) 
	{
      I ob = new InterfacePack1();
	  ob.disp();

	PackageSample op = 	  new InterfacePack1();
	op.show();

	}
}
