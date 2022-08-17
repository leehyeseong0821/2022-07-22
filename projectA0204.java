package projectA02;

public class projectA0204 {

	public static void main(String[] args) {
		
	int sum=10+20;
	int sum1=10;
	
	int sum2 = sum+sum1;
	System.out.println(sum2);
	
	long s=(long)(10+10+10+10+10+10+10+2147483648l);
	long f=(long)(10+10+10+10+10+10+10+2147483647);//l붙여야 정상값나옴.
	long g=(long)(10l+10l+10l+10l+10l+10l+10l+10l+2147384647);
	long d=(long)(2147483648l+10l+10l+10l+10l+10l+10l+10l);
	
	int k=(10+10+10+10+10+10+10+10+2147483647); //int는 앞자리수 다 빼야함
	System.out.println("s="+s);
	System.out.println("f="+f);
	System.out.println("g="+g);
	System.out.println("d="+d);
	System.out.println("k="+k);

	}

}
