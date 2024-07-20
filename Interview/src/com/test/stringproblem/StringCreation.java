package com.test.stringproblem;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="code";//string constant pool
		String s3="code";
		String s2=new String("code");//searches in string constant pool and if not found create object in heap or if found,craete reference to it.
		String s4=new String("code");
		System.out.println("s1:::"+s1);
		System.out.println("s2 using new keyword:::"+s2);
		System.out.println("s3:::"+s3);
		System.out.println("s4 using new keyword:::"+s4);
		
		System.out.println("s1==s3");
		System.out.println(s1==s3);
		System.out.println("s1.equals(s3)" + s1.equals(s3));
		
		System.out.println("s1==s2");
		
		System.out.println(s1==s2);
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		
		System.out.println("s2==s4");
		
		System.out.println(s2==s4);
		System.out.println("s2.equals(s4)"+s2.equals(s4));
		
		String s5=s2.intern();
		System.out.println(s5);
		System.out.println(s1.hashCode());
		s1=s1+"decode";
		System.out.println("s1 after apending:::"+s1);
		System.out.println(s1.hashCode());
	}

}
