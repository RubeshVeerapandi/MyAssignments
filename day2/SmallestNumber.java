package week1.day2;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[]{23,45,67,32,89,22};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];			
			
		}
		System.out.println("Smallest Number:"+min);

	}

}
