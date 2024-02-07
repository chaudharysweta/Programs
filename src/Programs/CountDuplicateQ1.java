package Programs;

import java.util.Arrays;

public class CountDuplicateQ1 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1,2,4};
		countDuplicate(arr);
	}

	 static void countDuplicate(int arr[]) {
		
		 Arrays.sort(arr);
		 for(int i=0; i<arr.length; i++)
		 {
			 int count=1;
			 for(int j=i+1; j<arr.length; j++)
			 {
				 if(arr[i]==arr[j])
					 count++;
				 else
					 break;
			 }
			 if(count>=1)
			 {
				 System.out.println(arr[i]+" : "+count);
				 i+=(count-1);
			 }
		 }
		
	}

}
