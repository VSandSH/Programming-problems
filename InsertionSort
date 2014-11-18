public class InsertionSort {
	public static void main(String[] args){
		String strNew = "John Doe";
		char[] arr = strNew.toCharArray();
		char tmp;
		int i,j;
		
		for(i = 1; i < strNew.length(); i++){
			j = i;
			while ((j > 0) && (arr[j] < arr[j-1])){
				tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
				j = j - 1;
			}
		}
		System.out.println(arr);
	}
}
