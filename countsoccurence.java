import java.util.*;
class countsoccurence {
public static void main(String args[]) {
int j,k,i,s,e,c=0;
Scanner t=new Scanner(System.in);
s=t.nextInt();
e=t.nextInt();
k=t.nextInt();
for(i=s;i<e;i++) {
String str=Integer.toString(i);
int l=str.length();
for(j=0;j<l;j++) {
if(str.charAt(j)== (k+48)) {
c++;
}}
}
System.out.println(c);

}}