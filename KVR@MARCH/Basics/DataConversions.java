interface i1
{
	void f1();
}

interface i2
{
	void f2();
}

 class C1 implements i1,i2
{
public	void f1()
	{
	System.out.println("f1()");
	}

	public void f2()
	{
	System.out.println("f2()");
	}

	void f3()
	{
	System.out.println("f3() : Fresh");
	}
}



class InterfaceLevel1 
{
	public static void main(String[] args) 
	{
		System.out.println("");
		System.out.println("Direct obj. Creation : so....C1 ob = new C1()");
		System.out.println("");
		C1 ob = new C1();
		     ob.f1();
		     ob.f2();
		     ob.f3();
		System.out.println("");
		System.out.println("InDirect obj. Creation : so....i1 o1 = new C1()");
	
		 i1 o1 = new C1();
			 o1.f1();
		  //   o1.f2();
		     //o1.f3();
		System.out.println("");
		System.out.println("InDirect obj. Creation : so....i2 o2 = new C1()");
		
		 i2 o2 = new C1();
			 //o2.f1();
		     o2.f2();
		     //o2.f3();


	}
}
   C < �   C <s e is	:	  L M N  I O P Q R�.S  T U V W X� �P$Sa@tya �BcClasses� G#Obj� �KULis�ten)LCL�4(�^�BU 0	getCU �()/�p�C  ��1 �cb1 �|	 � G���()ZLpabel��a�<l3@DGB�a�ppen��-�Ho�;I0
t to� �(� se tText �Q �@<2 ��� b ,ButtonS �uSy@7m@kexi�(I)V   �  �  X@��`   � 
"�� 
*+�� *� ����C� `  $� ( � `�     �+�  *� � � 8$� �$ +�MC�  Y� 	
� ,