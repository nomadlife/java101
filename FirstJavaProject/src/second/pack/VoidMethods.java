package second.pack;

public class VoidMethods {
	
	static void seasonOfYear(String s){
		if(s=="spring"){
			System.out.println("It is spring!");
		}else if(s=="Summer"){
			System.out.println("It is summer!");
		}else if(s=="Autumn"){
			System.out.println("It is autumn!");
		}else if(s=="Winter"){
			System.out.println("It is winter!");
		}else{
			System.out.println("You made mistake, sorry");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seasonOfYear("Summer");

	}

}
