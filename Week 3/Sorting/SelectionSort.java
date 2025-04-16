import java.util.Arrays;
public class SelectionSort{

	public static void sort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			int minIndex = i;
			for(int j=i+1; j<n; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
		}
	}
	
	public static void main(String[] a){
		int[] arr = {89,90,92,95,78,70,65,40,98};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}