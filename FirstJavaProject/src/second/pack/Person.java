package second.pack;

public class Person {
	String name;
	int age;
	Person(String n, int a){ //Consructo
		this.name=n;
		this.age=a;
		
	}
	void printMyName(Person p){ //class define
		String myNameAge = p.name +"" + p.age;
		System.out.println("My name and age are:"+myNameAge);
		
	}
}
