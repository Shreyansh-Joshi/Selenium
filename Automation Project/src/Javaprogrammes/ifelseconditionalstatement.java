package Javaprogrammes;

public class ifelseconditionalstatement {

	public static void main(String[] args) {

		int a=40,b=30,c=50,d=5;
		if (a>b&a>c&a>d){
			System.out.println("a is bigger than rest of variable");
		}
		else if(b>c&b>d){
			System.out.println("b is bigger than rest of variable");
		}
		else if(c>d){
			System.out.println("c is bigger than rest of variable");
		}
		else{
			System.out.println("d is bigger than rest of variable");
		}
		
	}

}
