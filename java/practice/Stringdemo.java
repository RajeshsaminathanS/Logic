package practice;

public class Stringdemo {

	public static void main(String[] args) {
		
 String a="Rajesh";
 String b="Rajesh";
 String c="Meena";
 String d="Mathi papa";
 String e="rajesh";
 String f="   Rajesh is a cute boy, he helps each other  ";
 String g="";

 
 
 char i=a.charAt(0);  //index value kandupudikka use pandrathu
 System.out.println(i);
 
 System.out.println(a.equals(b));
 System.out.println(a.equals(e)); // equal aha erunthaa true or false

 System.out.println(a.hashCode()); // hashcode print pannum
 
 System.out.println(a.compareTo(b)); // rendu string a compart pandrathuku. same ah erunthaa 0 nu print agum
 System.out.println(a.equalsIgnoreCase(e)); //case ignore pannirum caps small laa pallathu
 System.out.println(a.concat(c)); // rendu string a join panna use pandrathu
 
 System.out.println(a.contains("Ra"));
 System.out.println(a.contains("es"));  // nama ludullura letters anga erunthaa true or false
 System.out.println(a.contains("hi"));
 
 System.out.println(a.startsWith("Ra"));
 System.out.println(a.startsWith("es")); //  kudukkura value la start agirunthaa true illana false
 System.out.println(a.startsWith("hi"));
 
 System.out.println(a.endsWith("Ra"));
 System.out.println(a.endsWith("sh")); //  kudukkura value la end agirunthaa true illana false
 System.out.println(a.endsWith("hi"));
 
 System.out.println(f.indexOf("helps")); // kudukkura string oda index value priint pannum
 
 System.out.println(g.isEmpty()); // striing empty ah eruntha true or false
 
 System.out.println(f.length());  // string oda length kattum
 
 System.out.println(c.replace('e', 'a')); // replace pannum
 
 //System.out.println(c.replaceALL(i, i));
 System.out.println(a.toUpperCase());
 System.out.println(a.toLowerCase()); // loyar case ah change pannum
 
 System.out.println(f.trim()); // frent and back la erukka space a trim pannirum
 
 
 String f1[]=f.split(" ");
 System.out.println(f.split(" "));  // string a arrray va convert panni space vantha split panna soldrom
 for(String w:f1)
 {
	 System.out.println(w);
 }
 
 
	}

}
