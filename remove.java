import java.util.*;
class remove {
public static void main(String args[]) {
String a,b;int i,j;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
for(i=0;i<b.length();i++) {
a = a.replace(Character.toString(b.charAt(i)), "");
}
System.out.print(a);
}}