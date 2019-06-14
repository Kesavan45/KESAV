import java.util.*;
class vowel {
public static void main(String args[]) {
String a;
int i,j=0;
Scanner in=new Scanner(System.in);
a=in.nextLine();
char[] ar=a.toCharArray();
for(i=0;i<ar.length-1;i++) {
if(ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i'||ar[i] == 'o'|| ar[i] == 'u') {
for(j=ar.length-1;j>0;j--) {
if(ar[j] == 'a' || ar[j] == 'e' || ar[j] == 'i'||ar[j] == 'o'|| ar[j] == 'u') {
char temp='\0';
temp=ar[j];
ar[j]=ar[i];
ar[i]=temp;
break;
}
}}}
for(i=0;i<ar.length;i++) 
System.out.print(""+ar[i]);
}
}