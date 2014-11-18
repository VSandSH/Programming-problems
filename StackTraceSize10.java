public class StackTraceSize10 {
	public static void main (String[] args) {
		method1(10);
	}
	
	public static void method1(int n) {		
		if (n == 0)
			return;
		else {
			StackTraceElement[] ste = Thread.currentThread().getStackTrace();
			StackTraceElement e = ste[1];
			String methodName = e.getMethodName();
			int size = ste.length;
			System.out.println(methodName + " " + size);			
			method1(--n);
			
		}
	}
}
