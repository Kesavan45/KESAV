import java.util.*;
class pater {
public static void main(String args[]) {
String a;int i,j;
Scanner in=new Scanner(System.in);
a=in.nextLine();
char[] b=a.toCharArray();
for(i=0;i<=b.length;i++) {
for(j=0;j<i;j++){
System.out.print(b[j]);
}
System.out.println();
}
}}