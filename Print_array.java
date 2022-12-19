package Lec_16;
import java.util.*;
public class Print_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50};
		Print(0,arr);

	}
	public static void Print(int idx, int[]arr)
	{
		if(idx==arr.length)
			return;
		System.out.println(arr[idx]);
		Print(idx+1,arr);
	}

}
