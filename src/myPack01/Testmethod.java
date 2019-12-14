package myPack01;

public class Testmethod
{
	
	int num=2;
	int temp=0;
	int i = 2;
	String s = "Java";
	
	public void method1()
	{
		System.out.println("C#");
	}
	
	public void addNumbers()
	{
		int t = i + 10;
		System.out.println(t);
	}
	
	public void findOddEvenNumber()
		{
		
			if (i/2==0)
			
		{
			
		System.out.println("number is even: " +i);
		}
		else
		{
			System.out.println("numbber is odd: "+i);
		}
	}
	
	public void findPrimeNumber() 
	
	{
		for(int i=2;i<=num;i++)
		{
			if (num%i==0)
			{
				temp=temp+1;
			}
		}
		
		
			if(temp>0)
			{
				System.out.println("number is not prime: "+num);
				
			}
		else
		{
			System.out.println("number is  prime: "+num);
		}
		
	}
	
	
	static public void main(String[] abc)
	{
		Testmethod obj = new Testmethod();
		
		obj.method1();
		obj.addNumbers();
		obj.findOddEvenNumber();
		obj.findPrimeNumber();
		
		//new ClassA1().method1();   //Not a good Practice
		//new ClassA1().addNumbers();
	}
}



