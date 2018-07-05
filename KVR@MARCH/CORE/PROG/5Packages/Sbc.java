package sp;

public class Sbc
{
private int N_PRI=10;
			  int N_DEF=20;
protected int N_PRO=30;
public int N_PUB=40;


public Sbc()
{
System.out.println ("VALUE OF N_PRIVATE = "+N_PRI);
System.out.println ("VALUE OF N_DEFAULT = "+N_DEF);
System.out.println ("VALUE OF N_PROTECTED = "+N_PRO);
System.out.println ("VALUE OF N_PUBLIC = "+N_PUB);
}
}
// Sdc.java
// javac -d . Sdc.java