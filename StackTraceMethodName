public class StackTraceMethodName {
	public static void main (String[] args) {
		method1();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
	
	public static void method1() {
		method2();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
	
	public static void method2() {
		method3();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
	
	public static void method3() {
		method4();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
	
	public static void method4() {
		method5();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
	
	public static void method5() {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[1];
		String methodName = e.getMethodName();
		System.out.println(methodName);
	}
}
