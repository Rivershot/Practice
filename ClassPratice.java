package test;

public class ClassPratice {

	// 멤버 필드 선언
	private int score;
	private String sname;
	private int studentId;
	private String passnfail;
	
	// default 생성자
	public ClassPratice() {
		System.out.println("KH정보교육원");
		System.out.println("프로그래밍 언어응용 테스트 결과");
	}
	
	// Overloading 생성자
	public ClassPratice(int score, String sname, int studentId, String passnfail) {
		System.out.println("KH정보교육원");
		System.out.println("프로그래밍 언어응용 테스트 결과");
		this.score = score;
		this.sname = sname;
		this.studentId = studentId;
		this.passnfail = passnfail;
	}
	
	// 멤버 메소드
	public void display() {
		System.out.println("이름 : " + sname);
		System.out.println("학번 : " + studentId);
		System.out.println("점수 : " + score);
		System.out.println("합격여부는? " + passnfail);
	}
	
	// 멤버 메소드 Overloading
	public void display (int score, String sname) {
		System.out.println(sname + "님은 추가교육 대상자 입니다");
		System.out.println(sname + "님의 점수 : " + score );
	}
	
	// Getter / Setter 작성
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return sname;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getPassnfail () {
		return passnfail;
	}
	
	public void setScore (int score) {
		this.score = score;
	}
	
	public void setSname (String sname) {
		this.sname = sname;
	}
	
	public void setStudentId (int studentId) {
		this.studentId = studentId;
	}
	
	public void setPassnfail (String passnfail) {
		this.passnfail = passnfail;
	}
}
