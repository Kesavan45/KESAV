import java.util.*;
class twitt {
public static void main(String args[]) {
int i;
String s,a;
String c="";
Scanner in=new Scanner(System.in);
a=in.nextLine();
s=in.nextLine();
String[] b=a.split(",");
for(i=0;i<b.length;i++) {
c += (b[i].substring(0,s.length()));
if(s.equals(c)) {
System.out.print(""+b[i]+",");
c = "";
}
c="";
}
}}