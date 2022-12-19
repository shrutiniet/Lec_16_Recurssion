package Lec_16;

public class Max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {112, 34,157,23,45,89};
		int ans=Maximum(0,arr);
		System.out.println(ans);

	}
public static int Maximum(int idx, int[]arr)
{
	if(idx==arr.length)
		return Integer.MIN_VALUE;
	int max_no=Maximum(idx+1, arr);
	return Math.max(max_no,arr[idx]);
}
}
