package practice;

public class Builderdemo {

	public static void main(String[] args) {
		
StringBuilder s=new StringBuilder("Rajesh");
s.append("Meena");
System.out.println(s); //cancat panna use pandrathu

s.insert(2, "java");
System.out.println(s); // insert panna use pandrathu

s.replace(1, 4, "ooo");
System.out.println(s);  // inster panndrathu

s.delete(1, 4);
System.out.println(s); // delete pandrathu

s.reverse();
System.out.println(s);  // reverse pandrathu

System.out.println(s.capacity()); // capacity pakka. default 16. increse (16*2)+2==? answer

StringBuffer ss=new StringBuffer();


System.out.println(ss.capacity());
ss.append("Chandra is my god");
System.out.println(ss.capacity());
s.ensureCapacity(10);
System.out.println(ss.capacity());
s.ensureCapacity(100);
System.out.println(ss.capacity());






	

	}

}
