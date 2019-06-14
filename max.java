import java.util.*;
class max {
public static void main(String args[]) {
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
a[i]=in.nextInt();
}
Arrays.sort(a);
for(int j=a.length-1;j>=(a.length-3);j--) {
System.out.print(a[j]);
}
}}