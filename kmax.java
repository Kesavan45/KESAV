import java.util.*;
class kmax {
public static void main(String args[]) {
int j,i,n,k,max;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++) {
a[i]=in.nextInt();
}
k=in.nextInt();
for(i=0;i<a.length;i++) {
max=a[i];
for(j=1;j<k;j++) {
if(a[i+j] > max)
max=a[i+j];
}System.out.print(max + " ");
}
}}
