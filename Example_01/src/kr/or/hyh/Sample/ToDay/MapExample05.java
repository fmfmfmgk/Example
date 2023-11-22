package kr.or.hyh.Sample.ToDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample05 {
	Scanner sc = new Scanner(System.in);
	private static final String Map = null;


	public static void main(String[] args) {
		MapExample05 obj = new MapExample05();
//		obj.process();
//		obj.printList();
//		obj.Maxlist();
//		obj.sumSalary();
		obj.setlist();
	}
	
	private void process() {
		List<Map<String, Object>> data = dataInput();
		
		//1.전체 출력 메소드 만들어보기.
		//list 를 for문으로 꺼내는건 iterator 
		
		//2.월급 제일 많은 사람 정보 출력해보기.
		//for문을 이용 전체를 꺼낸뒤에(get. salary) 월급에서 max값 구하기
		
		//3.입력된 부서 별 salaly 총합 구해보기.
		//
		//int m1.put = (int) m1.get("emp_no"); 타입에 맞게
		
		//4.입력된 emp_no 정보 전체 출력해보기.
		//
		
	}
	

	private void setlist() {
		List<Map<String, Object>> data = dataInput();
		int select = sc.nextInt();
		
		for(int i=0; i<data.size(); i++) {
			Map map = data.get(i); //전체 출력후 map에 Map형태로 저장
			int emp = (int) map.get("emp_no");
			if(emp == select) { 
				System.out.println(data.get(i));
				break;
			}
		}
	}



	private int sumSalary() {
		List<Map<String, Object>> data = dataInput();
		
		int sum = 0;
		String select = sc.next();
		
		for(int i=0; i<data.size(); i++) {
			Map<String, Object> map = data.get(i); //전체 출력후 map에 Map형태로 저장
			String dept =  (String) map.get("dept");//
			if(!dept.equals(select)) continue;
			int salary = (int) map.get("salary");//합계를 구하려면 숫자여야 하므로 int형태의 salary변수로 변환
			sum+=salary;
		}
		System.out.println(sum);
		return sum;
	}



	
	public int Maxlist() {
		List<Map<String, Object>> data = dataInput();
		
		int max = 0;
		for(int i=0; i<data.size(); i++) {
			Map<String, Object> map = data.get(i);
			int salary = (int) map.get("salary");
			if(max< salary) {
				max = salary;
				
			}
		}
		System.out.println(max);
		return max;
	
	
		
		//선생님 방법
		
//		List<Map<String, Object>> list = dataInput();
//		List<Integer> list22 = new ArrayList<Integer>();
//		
//		for(int i = 0; i<list.size(); i++) {
//			Map m = list.get(i);
//			
//			int aa = (int)m.get("salary");
//			
//			list22.add(aa);
//		}
//		System.out.println(Collections.max(list22));
	}
	
	
	public void printList() {
		List<Map<String, Object>> list = dataInput();
		
		for(int i = 0; i<list.size(); i++) {
			Map m = list.get(i);
			System.out.println(list.get(i));
		}
	}
	
	
	public List<Map<String, Object>> dataInput(){
		
		List<Map<String, Object>> list = new ArrayList();
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("emp_no", 100);
		m1.put("emp_name", "장승수");
		m1.put("dept", "영업부");
		m1.put("tel", 010-8422-8117);
		m1.put("salary", 300);
		
		Map<String, Object> m2 = new HashMap<String, Object>();
		m2.put("emp_no", 101);
		m2.put("emp_name", "홍성범");
		m2.put("dept", "기획부");
		m2.put("tel", 010-7562-3217);
		m2.put("salary", 350);
		
		Map<String, Object> m3 = new HashMap<String, Object>();
		m3.put("emp_no", 102);
		m3.put("emp_name", "이만수");
		m3.put("dept", "기획부");
		m3.put("tel", 010-5562-6677);
		m3.put("salary", 500);
		
		Map<String, Object> m4 = new HashMap<String, Object>();
		m4.put("emp_no", 103);
		m4.put("emp_name", "강나미");
		m4.put("dept", "영업부");
		m4.put("tel", 010-4442-5614);
		m4.put("salary", 350);
		
		Map<String, Object> m5 = new HashMap<String, Object>();
		m5.put("emp_no", 104);
		m5.put("emp_name", "민병철");
		m5.put("dept", "총무부");
		m5.put("tel", 010-2542-8211);
		m5.put("salary", 250);
		
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		
		return list;
	}
}
