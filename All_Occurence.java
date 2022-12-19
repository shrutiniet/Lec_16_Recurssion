package Lec_16;

public class All_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {157,112,34,157,23,112,157,45,89,157};
		int val=157;
		//All(0,val,arr);					// 1 method
//		boolean[] bol=All1(0,val,arr);		//2 method using boolean array
//		for(int i=0;i<bol.length;i++)
//		{
//			if(bol[i]==true)
//				System.out.println(i);
//		}
		int[] ans_array=AllOcc(arr,0,val,0);   //3 method
		for(int x:ans_array)
		{
			System.out.println(x);
		}

	}
public static void All(int idx, int val, int[]arr)
{
	if(idx==arr.length)
		return;
	if(arr[idx]==val)
	
		System.out.println(idx);
	All(idx+1,val,arr);
	
}
public static boolean[] All1(int idx,int val,int[] arr)
{
	if(idx==arr.length)
		return new boolean[arr.length];
	if(val==arr[idx])
	{
		boolean[] bol=All1(idx+1,val,arr);
		bol[idx]=true;
		return bol;
	}
	else
	{
		boolean[] bol=All1(idx+1,val,arr);
		bol[idx]=false;
		return bol;		
	}
}
public static int[] AllOcc(int[] arr, int idx, int ali, int takatak) {
	if (idx == arr.length) {
		return new int[takatak];
	}

	if (arr[idx] == ali) {
		int[] sp = AllOcc(arr, idx + 1, ali, takatak + 1);
		sp[takatak] = idx;
		return sp;
	} else {
		int[] sp = AllOcc(arr, idx + 1, ali, takatak);
		return sp;
	}
}
}
