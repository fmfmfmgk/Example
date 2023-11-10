package kr.or.hyh;

import java.util.Scanner;

public class Ex20231110 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ex20231110 obj = new Ex20231110();
		obj.ex1();
	}

	private void ex1() {
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;
		int denom2 = 4;
		
		
		
        int numer = denom1*numer2+numer1*denom2;
		int denom = denom1*denom2;
		
		int max = 1;
		for (int i = 0; i<=numer && i<=denom ; i++) {
			if(denom%i == 0 && numer%i == 0) {
			max = i;
			}
		}
		numer = numer/max;
		denom = denom/max;
		
        int[] answer = {numer,denom};
        System.out.println(answer[1]);
	}
}
