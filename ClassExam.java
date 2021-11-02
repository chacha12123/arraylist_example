package example2.day8;

public class ClassExam {
	
	public static void main(String[] args) {
		
		// 사람
		
//		String name;
//		String home;
//		int age;
		
		Person p1 = new Person(); // 복사본(인스턴스) 만들어줘
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		p1.home = "대전";
		
		p2.name = "홍길순";
		p2.age = 21;
		p2.home = "서울";
		
		introduce(p1);
		introduce(p2);
		
	}
	
	public static void introduce(Person p) {
		System.out.println(p.home + " 사는 " + p.age + "살 " + p.name + "입니다.");
	}
	
}

class Person {
	String name;
	String home;
	int age;
}
