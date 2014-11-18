public class StackTraceCallerMethodLineNumber {
	public static void main (String[] args) {
		method1();
	}
	
	public static void method1() {
		method2();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[2];
		int methodName = e.getLineNumber();
		System.out.println(methodName);
	}
	
	public static void method2() {
		method3();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[2];
		int methodName = e.getLineNumber();
		System.out.println(methodName);
	}
	
	public static void method3() {
		method4();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[2];
		int methodName = e.getLineNumber();
		System.out.println(methodName);
	}
	
	public static void method4() {
		method5();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[2];
		int methodName = e.getLineNumber();
		System.out.println(methodName);
	}
	
	public static void method5() {
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		StackTraceElement e = ste[2];
		int methodName = e.getLineNumber();
		System.out.println(methodName);
	}
}
