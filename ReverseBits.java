public class ReverseBits{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		long a = Long.MAX_VALUE-449838839;
		String str = Long.toBinaryString(a);
		
		int[] arr = new int[str.length()];
		
		for (int j = 0; j < str.length(); j++)
			arr[j] = Character.getNumericValue(str.charAt(j));
		
		for (int b = 0; b < str.length()/2; b++){
			int tmp = arr[b];
			arr[b] = arr[str.length()-1-b];
			arr[str.length()-1-b] = tmp;
		}
		System.out.println(Long.toBinaryString(a));
		
		for (int i : arr){
			sb.append(i);
		}
		
		System.out.println(sb.toString());
		System.out.println(Character.getNumericValue('A'));
	}
}
