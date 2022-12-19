package Lec_16;

public class Print_reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		Print1(arr.length-1,arr);
		Print2(0,arr);
	}
public static void Print1(int idx, int[]arr)
{
	if(idx<0)
		return;
	System.out.println(arr[idx]);
	Print1(idx-1,arr);
}
public static void Print2(int idx, int[]arr)
{
	if(idx==arr.length)
		return;
	Print2(idx+1,arr);
	System.out.println(arr[idx]);
}
}
