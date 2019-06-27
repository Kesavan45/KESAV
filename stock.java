import java.util.*;
class stock {
public static void main(String args[]) {
int i,j,n,max=0;
Scanner in = new Scanner(System.in);
n=in.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++) {
a[i]=in.nextInt();
}
for(i=0;i<a.length;i++) {
for(j=i+1;j<a.length;j++) { 
if(a[j] - a[i] > max) {
max=a[j] - a[i]; 
} }}
System.out.println(max);
}}
 