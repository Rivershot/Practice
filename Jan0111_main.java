package test;

public class Jan0111_main {
	public static void main(String[] args) {
		
		Jan0111 j1 = new Jan0111();
		Jan0111 j2 = new Jan0111();
		
		j1.getGunslinger();
		j2.setGunslinger("Rivershot");
		
		System.out.println(j1.getGunslinger());
		System.out.println(j2.getGunslinger());
		
		System.out.println("=========================");
		
		Jan0111 j3 = new Jan0111();
		Jan0111 j4 = new Jan0111();
		
//		j4.setAccount("efgh5678@naver.com");
//		
//		System.out.println(j3.getAccount());
//		System.out.println(j4.getAccount());
	
		System.out.println("=========================");
	
		Jan0111.account = "park@hanmail.net";
		System.out.println(Jan0111.account);
		System.out.println("=========================");
	
		System.out.println(Jan0111.MAINID);
	
	}
}
