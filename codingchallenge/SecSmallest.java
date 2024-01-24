package codingchallenge;
import java.util.*;

/*created by VARSHINI K*/

public class SecSmallest {
	public int getSecondSmall(int[] arr) {
		int temp,i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecSmallest ss = new SecSmallest();
		int size;
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int[] array = new int[size];
	}
}