package second.pack;

public class Professor {
	
	String name;
	int age;
	String city;
	Professor(String n, int a, String c){
		this.name = n; //this keyword means that we are referring to current object.
		this.age = a; //Current object is object in class which we are using.
		this.city = c;
	}
	void print(){
		System.out.println(name+" "+age+" "+city);
	}
}
