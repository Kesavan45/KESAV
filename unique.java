import java.util.*;
class unique {
public static void main(String args[]) {
String a;
Scanner t=new Scanner(System.in);
a=t.nextLine();
String b="";
for(int i=0;i<a.length();i++) {
if(b.indexOf(a.charAt(i)) == -1) {
b += a.charAt(i);
}}
System.out.print(b);
}}