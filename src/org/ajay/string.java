package org.ajay;

public class string {
     public static void main(String[] args) {	
	 String s = "ajayannadurai";
	 
	 char c = s.charAt(4);
	 System.out.println(c);
	 
	 String l = s.toLowerCase();
	 System.out.println(l);
	 
	 String u = s.toUpperCase();
	 System.out.println(u);
	 
	 boolean e = s.isEmpty();
	 System.out.println(e);
	 
	 boolean b = s.startsWith("aj");
	 System.out.println(b);
	 
	 boolean d = s.endsWith("ai");
	 System.out.println(d);
	 
	 int x = s.length();
	 System.out.println(x);
	 
	 String r = s.replace('a', 'A');
	 System.out.println(r);
	 
	 String rep = s.replaceAll("sanjay", "ajay");
	 System.out.println(rep);
}
    
	}


