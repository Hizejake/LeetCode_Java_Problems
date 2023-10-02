package searching;

import java.util.*;

public class Arranging_Coins_NotDone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(arrangeCoins(n));
		sc.close();
	}

	public static int arrangeCoins(int n) {
		
//		int count = 0;
		
		if(n==1 || n==2) return 1;
		
		for(int i = 0; i<n; i++) {
			if(n == i*(i+1)/2) {
				return i;
			}else if(n < i*(i+1)/2) {
				return i-1;
			}
		}
		return 0;
		
	}
}
