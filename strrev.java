import java.util.*;
class strrev {
public static void main(String args[]) {
String a;int i,j;
Scanner in=new Scanner(System.in);
a=in.nextLine();
String b[]=a.split(" ");
for(i=0;i<b.length;i++) {
StringBuffer s=new StringBuffer(b[i]);
System.out.print(""+Character.toString(s.charAt(0)).toUpperCase() + ""+b[i].substring(1) + " s");
}
}}