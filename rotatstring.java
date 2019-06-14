import java.util.*;
class rotat {
public static void main(String args[]) {
String a,b;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
a=a+a;
if(a.contains(b))
System.out.println("true");
else
System.out.println("false");
}}