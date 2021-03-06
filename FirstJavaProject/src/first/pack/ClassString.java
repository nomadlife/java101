package first.pack;

public class ClassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name = "My name";
		//String surname = "My surname";
		//String country = "My country";
		
		/* This is a comment. 
		 * is this also comment? yes,
		 is this without asterisk also comment? yes.
		 */
		
		int i=1;
		String a="Value: "+ i;
		System.out.println(a);
		
		// Methods of Class String - equals()
		System.out.println("Test1-Methods of Class String - equals()");
		String a1="This is some text";
		String a2="this is some text";
		if(a1.equals(a2))
			System.out.println("Strings a1 and a2 similar");
		else
			System.out.println();
		if(a1.equalsIgnoreCase(a2))
			System.out.println("Strings a1 and a2 are similar");
		else
			System.out.println("String a1 and a2 are not similar");
		
		// Methods of Class String
		System.out.println("Test2-lowercase convert to uppercase");
		System.out.println("this is text".toUpperCase());
		
		// substring/startsWith
		System.out.println("Test3-substring/startsWith");
		String s = "This is some text";
		String s1 = s.substring(0, 5);
		System.out.println("s1="+s1);
		if(s.startsWith(s1))
			System.out.println("Starts with character from s1");
		else
			System.out.println("Does not start with charactors from s1");
		
		String s2="Some text";
		System.out.println(s2.substring(2)); // delete character from start
		
		//contains
		System.out.println("Test4-contains");
		if(s.contains("text"))
			System.out.println("String s contains 'text'");
		else
			System.out.println("Does not contain");
		
		//compareTo. result number means lexicographical distance
		System.out.println("Test5-compareTo-result number means lexicographical distance");
		String name1 = "Ara";
		String name2 = "Ana";
		System.out.println("name1.compareTo(name2) = "+name1.compareTo(name2));
		System.out.println("name2.compareTo(name1) = "+name2.compareTo(name1));
		System.out.println("name1.compareTo(name1) = "+name1.compareTo(name1));
		System.out.println("name2.compareTo(name2) = "+name2.compareTo(name2));
		if(name1.compareTo(name2)>0)
			System.out.println("After");
		else if(name1.compareTo(name2)<0)
			System.out.println("Before");
		else
			System.out.println("Same");
		
		
		//Arrays-one dimensional
		System.out.println("Test5, Arrays, one dimensional");
		/*
		int b[];
		b= new int[5];
		//int b[] = new int[5];//same as previoous
		//int[] b = new int[5];// also same
		int c[] = {1,2,3,4,5};
		*/
		
		//Arrays - two dimensional arrays
		System.out.println("Test6, Arrays, two dimensional");
		// int[][] b = {{1,2,3},{4,5,6}};
		
		int arr[]={1,3,5,7,9};
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+"");
		}
		int arr2[] ={2,4,6,8,10};
		for(int k:arr2){
			System.out.print(k+"");
		}
		int[][] arr3 = {{1,2,3},{4,5,6}};
		for(int l=0;l<arr3.length;l++){
			for(int m=0;m<arr3[m].length;m++){
				System.out.println(arr3[l][m]);
			}
			System.out.println();
		}
		
		
	}

}
