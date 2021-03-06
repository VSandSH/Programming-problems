public class PermuteCharacters{
	
	public PermuteCharacters(){		
	}

	public static boolean found = false;
	public static LinkedList<String> list = new LinkedList<String>();
	
	public static void permute(String s){
		permuteString("", s);
	} 
	
	private static void permuteString(String a, String b){
		int n = b.length();
		if (n == 0){ 
			if (!list.contains(a)){
				found = false;
			}
			else {
				found = true;
			}
			
			if(!found){
				list.add(a);
				System.out.println(list.getLast());
			}
		}
		else {
			for (int i = 0; i < n; i++)
				permuteString(a + b.charAt(i), b.substring(0, i) + b.substring(i+1, n));
		}
	}
	public static void main(String[] args){
		
		String s = "abrakadabra";
		permute(s);
		
		for (int j = 0; j < list.size(); j++)
			System.out.println(list.get(j));
		System.out.println(list.size());
	}
	
}
