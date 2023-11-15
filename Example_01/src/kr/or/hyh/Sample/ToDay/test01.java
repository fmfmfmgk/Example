package kr.or.hyh.Sample.ToDay;

import java.util.Arrays;

public class test01 {
	public static void main(String[] args) {
		int[] array = {2,1,8,7,11};
		//버블정렬 후 배열/2+1값을 리턴
		//1.버블정렬
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;		
				}
			}
		}
		System.out.println(Arrays.toString(array));
		//배열의 중간값 array/2+1 값을 출력
		
		for (int i = 0; i <= array.length/2+1; i++) {
			if(i == array.length/2) {
				System.out.println(array[i]);
			}
		}
	}
}
