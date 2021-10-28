package example2.day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// 배열
		int[] arr = new int[10]; // 0
		
		// 리스트 => 컨트롤(좌) + 쉬프트(좌) + O
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		// 변수, 배열 -> 데이터를 관리(추가, 삭제, 조회, 수정)
		
		// 리스트 크기 확인 -> size()
		System.out.println(list.size());
		
		// 추가 -> add(value) 가장 마지막 요소 뒤에 추가
		list.add(100);
		System.out.println(list.size());

		list.add(200);
		System.out.println(list.size());
		
		list.add(300);
		System.out.println(list.size());
		
		// 조회(데이터 가져오기) -> get(index);
		//System.out.println(arr[0]); // 배열
		System.out.println(list.get(0)); // 리스트
		System.out.println(list.get(1)); // 리스트
		System.out.println(list.get(2)); // 리스트
		
		
		// 삭제 -> list.remove(index);
		list.remove(1);
		System.out.println(list.get(1));
		
		// 수정 -> list.set(index, value);
		list.set(0, 1000);
		System.out.println(list.get(0));
		
	}

}
