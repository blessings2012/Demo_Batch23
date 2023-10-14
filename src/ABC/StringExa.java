package ABC;

public class StringExa {
public static void main(String args[]) {
	String str =new String("ram");
	String str2 ="ram";
	String s = new String("danish");
	String s2 = new String("rashmita");
	//System.out.println(str);
	//System.out.println(str2);
	//System.out.println(str==str2);
	/*
	 * //System.out.println(str.equals(str2)); System.out.println(s==s2);
	 * System.out.println(s.equals(s2));
	 */	
	
	//immutable
	/*
	 * String str3 ="rashmita"; String str4 =str3.concat(str);
	 * System.out.println(str4);
	 */
	
	
	StringBuilder sb = new StringBuilder("ram");
	
	StringBuilder sb1 = new StringBuilder("sita");
	
	sb.append(sb1);
	
	//System.out.println(sb);
	
StringBuffer sbf = new StringBuffer("ram");
	
//StringBuffer sbf2 = new StringBuffer("sita");
	
	//sbf.append(sbf2);
	
	String st = sbf.toString();
	System.out.println(str2.equals(st));
	
	
	
}
}
