import java.util.*;
class onemap {
public  static void main(String args[])  {
String a,b;int i,j;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
String d1="";
String d2=""; 
for(i=0;i<a.length();i++) {
String r=Character.toString(a.charAt(i));
if(!d1.contains(r)) {
d1 += r;
}
}
for(j=0;j<b.length();j++) {
String p=Character.toString(b.charAt(j));
if(!d2.contains(p)){
d2 +=p;
}
}
System.out.println(""+d1);
System.out.println(""+d2);
if(d1.length() == d2.length()) {
System.out.println("True");
}
else {
System.out.println("Invalid");
}
}}
