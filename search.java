import java.util.*;
class search {
public static void main(String args[]) {
int n,i,l=0;int flag =0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++) {
a[i]=in.nextInt();
}
int k=in.nextInt();
for(i=0;i<=n-1;i++) {
if(a[i] == k) {
flag=0;
l=i;
break;
}
else {
flag=1;
}}
if(flag==0) {
System.out.println(""+k + "found in position" +""+l);
}
else
{
System.out.println(""+k + "not found");
}
}}