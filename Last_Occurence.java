package Lec_16;

public class Last_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {112,34,157,23,112,45,89,157};
		int val=157;
		//int ans=LO1(arr.length-1,arr,val);
		int ans=LO2(0,arr,val);
		System.out.println(ans);

	}
public static int LO1(int idx, int[]arr, int val)
{
	if(idx<0)
		return -1;
	int value=LO1(idx-1,arr,val);
	if(arr[idx]==val)
		return idx;
	else
		return value;
}
 public static int LO2(int idx,int[]arr, int val)
{
	if(idx==arr.length)
		return -1;
	int value=LO2(idx+1,arr,val);
	if(arr[idx]==val && value==-1)
		return idx;
	else
		return value;
}
}
