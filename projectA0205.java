package projectA02;

public class projectA0205 {

	public static void main(String[] args) {
	/*
	 * 형변환
	 * 
	 */
//  문자>정수
		char c='A';
		int i=(int)c;
		System.out.println(i);
		
		char f='B';
		int i1=(int)f;
		System.out.println(i1);
		
//		정수>실수 
		double d=(double)i;
		System.out.println(d);
//		실수>정수 
		double z=3.64;
		int z1=(int)z;
		System.out.println(z1);
//		정수>문자
		int c1=65;
		char c2=(char)c1;
		System.out.println(c2);
		byte b1=127;
		short s1=b1;
		s1=(short)(s1+1);
		System.out.println(s1);
		
		byte b2=(byte)s1;
		System.out.println(b2);

	}

}
