package Lec_16;

public class First_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {112,34,157,23,112,45,89,157};
		int val=157;
		int ans=FO1(0,arr,val);
		System.out.println(ans);
	}
public static int FO1(int idx, int[]arr, int val)
{
	if(idx==arr.length)
		return -1;
	int value=FO1(idx+1, arr,val);
	if(arr[idx]==val)
		return idx;
	else
		return value;
}
}
