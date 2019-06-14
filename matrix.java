import java.util.*;
class matrix {
public static void main(String args[]) {
int m,n,i,j;
Scanner in =new Scanner(System.in);
System.out.println("Enter rows");
m=in.nextInt();
System.out.println("Enter columns");
n=in.nextInt();
int a[][]=new int[m][n];
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
a[i][j]=in.nextInt();
}}
for(i=0;i<m;i++) {
for(j=0;j<n;j++) {
System.out.print(""+a[i][j]);
System.out.println();
}}
}}