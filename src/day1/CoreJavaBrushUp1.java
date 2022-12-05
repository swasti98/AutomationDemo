package day1;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Even or Odd
		int arr[]= {1,4,7,9,0,2,3,8,6,45,89};
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println(arr[i]+ " Even Element");
			
			}
			else
			{
				System.out.println(arr[i]+ " Odd Element");
			}
		
		}
	}

}
