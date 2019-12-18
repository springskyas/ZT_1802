package page001;

public class E06 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 100; i += 2) {
			sum=sum+i;
		}
		System.out.println("100以内奇数的和是"+sum);
		
		
		sum=0;
		int i = 2;
		while(i <= 100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println("100以内偶数的和是"+sum);
	}
}