package pack;

public class StrChange {
	    public static void main (String[] args) {
	    String str = "MYHOMEISJEWEL";
	    String str1 = str.substring(8);
	    String str2 = str.substring(0,6);
	String str3 = str.substring(6,8);
	str1=str1.concat(str3);
	    System.out.println(str1.concat(str2));
	    }
	}


