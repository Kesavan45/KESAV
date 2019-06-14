import java.util.*;
class sqsort {
public static void main(String args[]) {
int n,i;
Scanner t=new Scanner(System.in);
n=t.nextInt();
int[] a=new int[n];
int[] b=new int[n];
for(i=0;i<n;i++) {
a[i]=t.nextInt();
}
for(i=0;i<n;i++) {
b[i]=a[i]* a[i];
}
Arrays.sort(b);
for(i=0;i<n;i++) {
System.out.print(""+b[i] + " ");
}
}}