import java.util.*;
class strrev {
public static void main(String args[]) {
String a,b;
Scanner in=new Scanner(System.in);
a=in.nextLine();
String b=new StringBuffer(a).reverse().toString();
System.out.println(""+b);
}}