import java.util.*;
class edit {
public static void main(String args[]) {
String a,b;int i,c=0;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
int len = (a.length() >b.length())?a.length() :b.length();
for(i=0;i<a.length();i++) {
if(a.charAt(i).equals(b.charAt(i))) {
c++;
}
}
System.out.print(""+(len-c));
}}