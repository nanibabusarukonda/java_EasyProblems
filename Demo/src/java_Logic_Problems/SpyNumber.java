package java_Logic_Problems;

public class SpyNumber {

	public static boolean spyNumber(int num) {
		int sum=0;int prod=1;
		int temp=Math.abs(num);
		while(temp>0) {
			int d=temp%10;
			sum+=d;
			prod*=d;
			temp/=10;
			
		}
		return sum==prod;
	}
	public static void main(String[] args) {
		System.out.println(spyNumber(123)? "  SpyNumber": " not a SpyNumber");

	}

}
