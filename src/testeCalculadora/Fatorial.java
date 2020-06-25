package testeCalculadora;

public class Fatorial {
	
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		for(int i=num; i>1; i--) {
			total *= i;
		}
		 return total;
	}
	
	public static int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * fatorial( num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
	}
}
