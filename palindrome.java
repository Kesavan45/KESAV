import java.util.*;
class palindrome {
public static void main(String args[]) {
String a,b;
Scanner in=new Scanner(System.in);
a=in.nextLine();
String b=new StringBuffer(a).reverse().toString();
if(a.equals(b)){
System.out.println("Palindrome");
else
System.out.println("Not");
}}