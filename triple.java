import java.util.*;
class triple {
public static void main(String args[]) {
int n,i;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++) {
a[i]=in.nextInt();
}
Arrays.sort(a);
if(a[0] != a[1]) {
System.out.print(""+a[0]);
}
for(i=1;i<a.length-1;i++) {
if(a[i] != a[i+1] && a[i] != a[i-1]) {
System.out.print(""+a[i]);
break;
}
}
if(a[a.length-1] != a[a.length - 2]) {
System.out.print(""+a[a.length -1]);
}
}} 