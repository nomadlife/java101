package first.pack;

public class ControlFlow {
	public static void main(String[] args) {
	
		System.out.println("====Test1");
		int a = 10;
		if(a<11){
			System.out.println("A is less than 10");
		}
		else{
			System.out.println("A is not less than 10");
		}
		
		System.out.println("====Test2");
		
		int b=15;
		if (b==13)
			System.out.println("b==13");
		else if ((b<=17)&&(b>=12))
			System.out.println("b ~~~ ");
		else 
			System.out.println("b~~~");
		
		System.out.println("=====Test3");
		
		int grade;
		int score=85;
		
		if (score >= 95)
			grade = 10;
		else if (score >= 85)
			grade = 9;
		else if (score >= 75)
			grade = 8;
		else if (score >= 65)
			grade = 7;
		else if (score >= 55)
			grade = 6;
		else 
			grade = 5;
		System.out.println("Grade is :"+grade);
		
		
		System.out.println("=====Test4");
		int c=9;
		int d=0;
		if(c<10)
			d = c * 100;
		else 
			d = c * 10;
		System.out.println("Result is :"+d);
		
		System.out.println("=====Test4-2");
		
		int e=c<10?c*100:c*10;
		System.out.println("Result is :"+e);
		
	}
}




