import java.util.*;
class sortrbg {
public static void main(String args[]) {
String a;
Scanner in=new Scanner(System.in);
a=in.nextLine();
char[] b=a.toCharArray();
Arrays.sort(b);
int i;
for(i=b.length-1;i>0;i--) {
System.out.print(""+b[i]);
}
}}