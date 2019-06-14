import java.util.*;
class parenthsis {
public static void main(String args[]) {
String a;int i,j,m=0,n=0;;
Scanner in = new Scanner(System.in);
a=in.nextLine();
char[] b=a.toCharArray();
for(i=0;i<b.length;i++) {
if(b[i] == '{') {
m++;
}}
for(j=0;j<b.length;j++) {
if(b[j]== '{'){
n++;
}}
if(m==n)
System.out.println("true");
else
System.out.println("false");
}}