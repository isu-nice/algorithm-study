package baekjoon;

public class Q15596 {
	
	long sum(int[] a) {
		long ans = 0;
		
		for(int i : a) {
			ans += (long) i;
		}
		
		return ans;
	}
	
}
