package second.pack;

public class StaticClass {
	int val =3;
	static int val2 =4;
	
	static void changeValue(){
		val2=6;
		System.out.println(val2);
	}
	static void print(){
		System.out.println(val2);
		System.out.println("Static method calling!");
	}

	static{ //static block. this executed when a class is first loaded
		System.out.println("static");
	}
	
	public static void main(String[] args) {
		//public : is visible in whole project
		// static : belongs to class.
		// void : doesn't return any value.
		// TODO Auto-generated method stub
		StaticClass.print();
		StaticClass.changeValue();
		
		System.out.println("main");
		System.out.println("Random number"+Math.random());
		
		int a=4;
		int b=2;
		double c=2.4;
		System.out.println("Minimum is:"+Math.min(a, b));
		System.out.println("Maximum is:"+Math.max(a, b));
		System.out.println("Pow of c is:"+Math.round(c));
		
		
	}
}
