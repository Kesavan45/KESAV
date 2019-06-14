import java.util.*;
class mindif {
public static void main(String args[]) {
int n,i;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
for(i=0;i<n;i++) {
a[i]=in.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++) {
System.out.print(""+a[i]);
}
for(i=0;i<a.length-1;i++) {
 b[i]=a[i+1]-a[i];
System.out.println(""+b[i]);
}
Arrays.sort(b);
System.out.println(""+b[0]);

}}
