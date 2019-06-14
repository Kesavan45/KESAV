import java.util.*;
class vowel1 {
public static void main(String args[]) {
String ar,u="";
Character p='\0',g='\0';
int i,j=0;
Scanner in=new Scanner(System.in);
ar=in.nextLine();
char[] a=ar.toCharArray();
for(i=0;i<=a.length-1;i++) {
if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i'||a[i] == 'o'|| a[i] == 'u') {
p=a[i];
u += p.toString();

}}
//System.out.print(""+u);
char[] b=u.toCharArray();
for(i=0;i<1;i++) {
for(j=b.length-1;j>0;j--) {
char temp =b[j];
b[j]=b[j-1];
b[j-1]=temp;
}}
j=0;
for(i=0;i<=a.length-1;i++) {
if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i'||a[i] == 'o'|| a[i] == 'u') {
if(j<3)
g=a[i];
a[i]=b[j];
b[j]=g;
j++;
}
System.out.print(""+a[i]);
}
}}