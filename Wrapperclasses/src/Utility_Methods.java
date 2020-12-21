import java.util.*;
public class Utility_Methods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ss=s.next();
		// i) valueOf()
		Integer I=Integer.valueOf(n);
		System.out.println(I);
		Byte b=Byte.valueOf((byte)n);
		System.out.println(b);
		Integer i=Integer.valueOf(ss);
		System.out.println(i);
		
		// ii)xxxValue()
		int i1=I.intValue();
		System.out.println(i1);
		byte b1=b.byteValue();
		System.out.println(b1);
		
		//parseXxx()
        int s1=Integer.parseInt(ss);
        System.out.println(s1);
        short sh=Short.parseShort(ss);
        System.out.println(sh);
          
        //toString()
        String s2=Integer.toString(n);
        System.out.println(s2);
        String s3=Integer.toString(I);
        System.out.println(s3);
		
         s.close();
	}

}
