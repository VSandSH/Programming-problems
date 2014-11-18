public class QuickSort{
		
	public static void quickSort(int[] arr, int low, int high){
		if (arr == null || arr.length == 0)
			return;
			
		if (low >= high)
			return;
			
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
			
		int i = low, j = high;
		while (i <= j){
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		System.out.println(pivot);
		for (int b: arr)
			System.out.print(b + " ");
		System.out.println();
			
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}
		
	public static void printArray(int[] arr){
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println("");
	}
		
	public static void main (String[] args){
		int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArray(x);
			
		int low = 0, high = x.length - 1;
		quickSort(x, low, high);
		printArray(x);
	}
}
