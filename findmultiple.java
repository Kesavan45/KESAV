import java.util.*;
class findmutiple {
public static void main(String args[]) {
int i,n,k,j,c=0;;
Scanner in=new Scanner(System.in);
n=in.nextInt();
k=in.nextInt();
for(i=1;i<=n;i++) {
for(j=1;j<=n;j++) {
if((i*j)==k) {
c++;
}}}
System.out.print(c);
}}