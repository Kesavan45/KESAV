import java.util.*;
class trialzeros{
public static void main(String args[]) {
int i,count=0;
String c="";
Scanner t=new Scanner(System.in);
i=t.nextInt();
String a=Integer.toBinaryString(i);
while((i&1)==0) {
i=i>>1;
count++;
}
System.out.print(count);
}}