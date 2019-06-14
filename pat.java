import java.util.*;
class pat {
public static void main(String args[]) {
int a,m=0,i,j;
Scanner in=new Scanner(System.in);
a=in.nextInt();
int k=(a*(a+1))/2;
for(i=a;i>=1;i--) {
for(j=i;j>=1;j--,k--){
System.out.print(k + " ");
}
System.out.println();
}}}