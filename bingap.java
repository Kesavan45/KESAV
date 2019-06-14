import java.util.*;
class bingap {
public static void main(String args[]) {
int a,i,c=0,j=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
String b=Integer.toBinaryString(a);
System.out.print(b);
char s[]=b.toCharArray();
Character p;
for(i=0;i<s.length;i++) {
p=s[i];
if(p.equals('0')) {
j+=1;
}
if(p.equals('1')) {
if(j>c) {
c=j;}
j=0;
}
}
System.out.println();
System.out.println(c);
}}