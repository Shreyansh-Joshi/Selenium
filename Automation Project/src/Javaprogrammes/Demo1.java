package Javaprogrammes;

class myclass{

	void m1(){
		System.out.println("Selenium Testing");
	}
	void m2(){
		int x=10,y=20;
		System.out.println(x+y);
	}
	
	
}
class myclass3 {
	void m3(){
		System.out.println("Webdriver with Java");
	}
}

public class Demo1 {


	public static void main(String[] args) {

		myclass obj=new myclass();
		myclass3 obj2=new myclass3();
		obj.m1();
		obj.m2();
		obj2.m3();
		
	}

}
