package kr.or.hyh.Sample.ToDay;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWorkCalendar {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWorkCalendar obj = new HomeWorkCalendar();
		obj.process();
		
	}
	 
	private void process() {
		 //  년 월을 스캐너를 통해 입력 받고 달력을 출력해 볼것.
		 //  다음달, 이전달
		//해당 년,월 입력
			System.out.println("년도 입력");
			int year = sc.nextInt();
			
			System.out.println("월 입력");
			int mon = sc.nextInt();
			//형식변환
			SimpleDateFormat sdf = new SimpleDateFormat("dd");
			//입력된 년, 월값을 날짜로 저장.
			Calendar cal = Calendar.getInstance();
			//해당 월의 마지막 날
			while(true) {
				cal.set(Calendar.YEAR, year);
				cal.set(Calendar.MONTH, mon-1);
				cal.set(Calendar.DATE, 1);
				int last = cal.getActualMaximum(Calendar.DATE);
			//해당 날짜의 요일을 1~7로 나타냄 (1:일요일)
			int start = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("---------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("---------------------------------------------------");
			for(int i = 1; i <start; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <=last; i++) 
			{
				System.out.print(i+"\t");
				if(start%7 == 0) {
					System.out.print("\n");
				}
				start++;
			}
			System.out.println();
			System.out.println("---------------------------------------------------");
			System.out.println("<이전달                                                                                             다음달>");
			String i = sc.next();
			if(i.equals(">")) {
				mon++;
			}else if(i.equals("<")) {
				mon--;
			}
		}
	}
}
