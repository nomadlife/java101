package first.pack;

public class ControlFlow {
	public static void main(String[] args) {
	
		// Control Flow Statements
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
		
		int e=c<10 ? c*100 : c*10;
		System.out.println("Result is :"+e);
		
		// Switch Statement
		System.out.println("=====Test5, Switch Statement");
		int season =2;
		switch(season){
			case 1:System.out.println("Spring");
			break;
			case 2:System.out.println("Summer");
			break;
			case 3:System.out.println("Autumn");
			break;
			case 4:System.out.println("Winter");
			break;
			default:System.out.println("Unknown Season");
			break;
		}
		
		// Print Statement
		System.out.println("=====Test6, Print Statement");
		System.out.print("Message"); // just print
		System.out.println("Message"); // add a new line after command.
		String str = "World";
		System.out.printf("Hello %s",str); //placeholder for a String (%s), char, int, float, blooean
		
		//for (initialization; condition; increment/decrement{body}
		System.out.println("");
		for(int i=1;i<=10;i++){
			System.out.print(i+""); //try println to see difference
		}
		// what if we want to iterate in reverse way.
		for (int i=10; i>=1; i--){
			System.out.println(i+" ");
		}
		
		//for each
		System.out.println("=====Test7, for each");
		double[] array = {1.6, 2.8, 4.54};
		for (double ar : array){
			System.out.println(ar+" ");
		}
		
		//Nested loops
		System.out.println("=====Test8, Nested loops");
		for(int i=0; i<10; i++){
			if(i==7){
				break; // when loop reasches to 7 it stops and prints everything until that condition
			}
			if(i==2)
				continue; // when condition is met it stops and start another iteration.
			System.out.println(i+" ");
			
		}
		
		// break and continue
		System.out.println("=====Test9, break and continue");
		int sumEven=0;
		int sumOdd=0;
		int counterEven=1;
		int counterOdd=1;
		
		for (int i=1; i<=100; i++){
			if (i%2==0){
				if(counterEven ==3){ // sum of 6n. proved by octave.
					sumEven+=i;
					counterEven =1;
				}else counterEven ++;
			}else{
				if(counterOdd ==5){ // sum of 10n-1. proved by octave
					sumOdd+=i;
					counterOdd =1;
				}else counterOdd++;
			}
		}
		System.out.println("Sum of even numbers is:"+sumEven+",sum of odd numbers is:"+sumOdd);
		
		//While loop
		System.out.println("=====Test10, While loop");
		
		int n=15;
		int i=5;
		while (i<n){
			System.out.print(i+""); // print 5,6,7,,,14
			i++;
		}
		
		// Do while
		System.out.println("=====Test11, Do While loop");
		//difference between those two is that do while loop will execute minimum one time.
		int y=0;
		do{
			System.out.print(y++);
		}while(y<10);
	}
}





