class MultiplcationDemo 
{		//Busnesss Logic
int x;
void set(int n)
	{
 x= n;
}

void Table()
	{
	for(int i =0;i<21;i++)
		{
		int t = i*x;
	System.out.println(i+"*"+x+"=	"+t);
		}

	}


	public static void main(String[] args) //exicition logic
	{
MultiplcationDemo m = new MultiplcationDemo();
m.set(5);
m.Table();
	}
}
