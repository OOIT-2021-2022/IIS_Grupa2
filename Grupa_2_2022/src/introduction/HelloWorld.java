package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");

		double firstNumber = 5;
		double secondNumber = 2;

		int result = (int) (firstNumber / secondNumber);
		System.out.println(result);

		System.out.println("5" + result);
		System.out.println(Integer.parseInt("5") + result);
		// System.out.println(Integer.parseInt("a") + result);

		boolean alwaysTrue = true;
		boolean alwaysFalse = false;
		System.out.println(alwaysTrue && alwaysFalse);
		System.out.println(alwaysTrue || alwaysFalse);
		System.out.println(!alwaysTrue);

		// 1. Zadatak
		System.out.println("Prvi zadatak");
		int a = 24;
		int b = 12;
		String operation = "-";
		if (operation == "+")
			System.out.println(a + b);
		else if (operation == "-")
			System.out.println(a - b);
		else if (operation == "/")
			System.out.println(a / b);
		else
			System.out.println(a * b);
		
		//2. Zadatak
		int faktorijel = 1;
		for (int i = 5; i>1; i--)
		{
			faktorijel *= i;
		}
		System.out.println(faktorijel);
		
		
		//3. Zadatak 
		for(int j = 1; j<=10; j++) {
			if(j%2==1) {
				System.out.println(j);
				//break;
				//continue;
			}
		}
	}

}
