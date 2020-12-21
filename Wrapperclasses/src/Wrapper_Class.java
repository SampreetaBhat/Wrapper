
public class Wrapper_Class {

	public static void main(String[] args) {
		//converting primitive to respective   wrapper class object using primitive type as an argument
		Integer I=new Integer(10);
		System.out.println(I);
		Byte b=new Byte((byte)10);
		System.out.println(b);
		Short s=new Short((short)10);
		System.out.println(s);
		Float f=new Float(10);
		System.out.println(f);
		Double d=new Double(10);
		System.out.println(d);
		Character c=new Character((char)10);
		System.out.println(c);
		Character cc=new Character('a');
		System.out.println(cc);
		Boolean bl=new Boolean(true);
		System.out.println(bl);
		
		//converting primitive to respective wrapper class object using String as an argument
		Integer I1=new Integer("10");
		System.out.println(I1);
		Byte b1=new Byte("10");
		System.out.println(b1);
		Short s1=new Short("10");
		System.out.println(s1);
		Float f1=new Float("10");
		System.out.println(f1);
		Double d1=new Double("10");
		System.out.println(d1);
		Boolean bl1=new Boolean("true");
		System.out.println(bl1);
		
	}

}
