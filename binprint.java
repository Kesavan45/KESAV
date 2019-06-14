import java.util.*;
class binprint {
public static void main(String args[]) {
int a,i;
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(i=0;i<=a;i++) {
String b=Integer.toBinaryString(i);
System.out.println(b);
}}}