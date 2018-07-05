

class IntanceVsStatic
{


void disp1 ()
{
System.out.println ("disp1- Cons");
}


static void disp2 ()
{
System.out.println ("disp2-Static");
}


public static void main (String k [])
{
System.out.println ("main-begin");

IntanceVsStatic so = new IntanceVsStatic ();

so. disp1 ();
so. disp1 ();
so. disp1 ();

IntanceVsStatic. disp2 ();
IntanceVsStatic. disp2 ();
IntanceVsStatic. disp2 ();

System.out.println ("main - End");
}
} //IntanceVsStatic