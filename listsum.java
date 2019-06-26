import java.util.*;
class listsum {
public static void main(String args[]) {
int i,k,m,j,flag=0;;
Scanner n=new Scanner(System.in);
m=n.nextInt();
int[] a=new int[m];
for(i=0;i<m;i++) {
a[i]=n.nextInt();
}
k=n.nextInt();
for(i=0;i<=a.length-1;i++) {
for(j=i+1;j<=a.length-1;j++) {
if((a[i] + a[j]) == k) {
flag++;
}}
}
if(flag != 0) {
System.out.print("True");
}
else {
System.out.print("False");
}
}}

