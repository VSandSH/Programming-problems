class IncrementArray{
	//public static int[] arr = {1,6,6,9};
	public static void increment(int[] arr, int i){
		//int num = arr.length-1;
		if ((arr[i] + 1) < 10){
			arr[i] = arr[i] + 1;
			//System.out.println(Arrays.toString(arr));
			return;
		}
		else {
			arr[i] = 0;
			increment(arr, --i);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {0,9,9,5};
		increment(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
		increment(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
		increment(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
