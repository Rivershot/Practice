package test;
public class Practice_0109 {
	public static void main(String[] args) {
		// 인스턴스화
		ClassPratice cp = new ClassPratice();
		// 김댕댕 정보 입력
		cp.setSname("김댕댕");
		cp.setScore(98);
		cp.setStudentId(20230110);
		cp.setPassnfail("합격");
		
		// 멤버 메소드 호출
		cp.display();
		
		System.out.println("================");
		
		// Overloading 생성자 사용
		ClassPratice cp1 = new ClassPratice(87, "이냥냥", 20230101,"합격");
		cp1.display();
		
		System.out.println("================");
		cp1.setSname("박야옹");
		cp1.setScore(75);
		cp1.setStudentId(20230102);
		cp1.setPassnfail("합격");
		
		// 멤버 메소드 호출
		cp1.display();
		
		System.out.println("================");
		// Overloading 멤버 메소드 사용
		cp1.display(40, "이야옹");
		
		
		
		
		
		
		
		
	}
}

