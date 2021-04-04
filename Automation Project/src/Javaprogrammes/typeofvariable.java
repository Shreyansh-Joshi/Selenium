package Javaprogrammes;

	class mywork{
		int a=10;//Instance/Global Variable
		int b=20;//Instance/Global Variable
		int c=30;//Instance/Global Variable
	void m1(){
		int d;//Local Variable
		d=a+b;
		System.out.println(d);
	}
	void m2(){
		int e;//Local Variable
		e=b+c;
		System.out.println(e);
	}
	}

public class typeofvariable {

	public static void main(String[] args) {
		mywork obj=new mywork();
		obj.m1();
		obj.m2();
	
	}

}
