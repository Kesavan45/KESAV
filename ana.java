import java.util.*;
class ana {
public static void main(String args[]) {
String a,b;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
if(a.length() == b.length()) {
char[] c=a.toCharArray();
Arrays.sort(c);
char[] d=b.toCharArray();
Arrays.sort(d);
if(Arrays.equals(c,d))
{
System.out.println("anagrams");
}
else
{
System.out.println("not anagrams");
}}
else
System.out.println("not anagrams");

}}