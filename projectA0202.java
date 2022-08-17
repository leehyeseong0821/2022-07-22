package projectA02;

public class projectA0202 {

	public static void main(String[] args) {
		
		char name ='이';
		char name1 ='혜';
		char name2 ='성';
		System.out.println(""+name+name1+name2);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		
		String 이름="이혜성";
		System.out.println(name+name1+name2);
		System.out.println(이름);
		System.out.println(이름+name+name1+name2);//첫번째 자리수마다 달라진다 결과값
		
		System.out.println(10+20+이름); //첫번째 숫자가 들어가면 더한다.
		System.out.println(이름+10+20);
		System.out.println(10+30+40+"hi");
		System.out.println("hi"+10+20);
		System.out.println("hi"+(10+20));
		System.out.println(10+30+"hi"+30*40);
		System.out.println("hi"+30*40);//곱하기는 우선순위때문에 가능하다.
		System.out.println("("+10+20+")");
		System.out.println((10+20));
		char c1='가';
		char c2='나';
		System.out.println(c1+c2);
		System.out.println(""+c1+c2);
		
		String str =10+20+"안녕";
		System.out.println(str);
		String str1 ="안녕"+10+20;
		System.out.println(str1);
		System.out.println();
	    System.out.println(10);//10진수
	    System.out.println(017);//8진수
	    System.out.println(0x1f);//16진수
	    System.out.println(0b01010101010);//2진수
	    
	    System.out.println();
	    char c='\u0041';
	    System.out.println(c);
	    char d='\u0042';
	    System.out.println(d);
	    char e='\u0043';
	    System.out.println(e);
       char f ='\uae00';
       System.out.println(f);
       
       String str2="안녕\t안녕하세요\t나는\n\"이혜성\"입니다";
       System.out.println(str2);
       String str3="안녕\b안녕하세요\t나는\'이혜성\'입니다";
       System.out.println(str3);
	   String str4="안녕\t바보\n입니다.";
	   System.out.println(str4);
	   
	   boolean b1 =true;
	   boolean b2 =false;
	   System.out.println(b1);
	   System.out.println(b2);
	   boolean b3=(1>10);
	   boolean b4=(1<10);
	   boolean b5=(10==10);
	   System.out.println(b3);
	   System.out.println(b4);
	   System.out.println(b5);
	   
	   String s1=null;
	   String s2="";
	   int a1[]=null;
	   System.out.println(s1);
	   System.out.println(a1);
	   System.out.println(s2);
	    
		
		

	}

}
