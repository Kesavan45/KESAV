import java.util.*;
class multiplegreat {
public static void main(String args[]) {
int n,i,b=0;
Scanner in = new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
a[i]=in.nextInt();
}
Arrays.sort(a);
int p=a.length-1;
int y=a.length-2;
b=a[p] * a[y];
System.out.println(""+b);
}}