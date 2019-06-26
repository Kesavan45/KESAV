import java.util.*;
class encode {
public static void main(String args[]) {
String a;int i,count=0;
Scanner in=new Scanner(System.in);
a=in.nextLine();
char[] b=a.toCharArray();
for(i=0;i<b.length()-1;i++) {
if(b[i] == b[i+1]) {
count++;
}
System.out.print(""+count + ""+a[i]);
count =0;
}
}}

