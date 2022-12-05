package day1;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data Type
		int a = 10;
		String b = "Swasti";
		char c = 'w';
		boolean n = true;
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(c);
		System.out.println(n);
		System.out.println(a+" = sum of d and f"); 
		// Define integer Arrays
		int array[]= new int[4];
		array[0] = 2;
		array[1] = 8;
		array[2] = 5;
		array[3] = 1;
		System.out.println(array[0]+array[1]);
		System.out.println(array[3]);
		System.out.println(array[2]*array[1]);
		System.out.println(array[1]/array[3]);
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		// Define string Array.
		String p[] = { "Swasti", "Sonu", "Sourav", "Swati"};
		for(int d=0; d<p.length;d++)
		{
			System.out.println(p[d]);
		}
		String name[] = {"Amlan", "Ashutosh", "Abhishek", "Ajit","Abinash"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		//Define Enhanced for loop
		for(String s:name)
		{
			System.out.println(s);
		}
		
		
		
		
	    
		

	}

}
