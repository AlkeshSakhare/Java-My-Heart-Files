interface interfaceCheck
{
   int a=90;
   int b=9;
   
   //int a,b;//must be intialize other wise C_T_ERROR___:	interfaceCheck.java:3: = expected   int a,b;        ^          ^2 errors
   //a=10;
   //b=20;  } this also not possible...you must intilaze at time of Declaration

   void f1();
   void f2();
}

/*---------------------------------

D:\study\BOOKS LIBRARY\PROGRAMMING\JAVA\SathyaJAVA\KVR@MARCH>javap interfaceCheck
Compiled from "interfaceCheck.java"
interface interfaceCheck{
    public static final int a;
    public static final int b;
    public abstract void f1();
    public abstract void f2();
}
*/