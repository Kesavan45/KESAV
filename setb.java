import java.util.*;
class setb {
public static void main(String args[]) {
int a,i;
Scanner in=new Scanner(System.in);
a=in.nextInt();String h="";
String b=Integer.toBinaryString(a);
System.out.print(b);
char[] p=b.toCharArray();
int j=p.length;
for(i=0;i<j-2;i++) {
if(p[i+1] == '1') {
h="m";
}}
if((p[0]=='1' && p[j-1]=='1') && h!="m") {
System.out.print("true");
}
else {
System.out.print("false");
}
}}