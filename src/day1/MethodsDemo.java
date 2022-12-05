package day1;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d= new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodDemo1 d1=new MethodDemo1();
		String name1 = d1.getUserData();
		System.out.println(name1);
		
		
		
	}

	public String getData() {
		// TODO Auto-generated method stub
		System.out.println("Hi Swasti");
		return "Hello";
	}

}
