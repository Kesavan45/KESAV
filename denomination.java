import java.util.*;
class denomination {
public static void main(String args[]) {
int i,s,c=0;
Scanner t=new Scanner(System.in);
s=t.nextInt();
int[] arr={500,100,50,20,10,5,2,1};
int[] arr1=new int[8];
for(i=0;i<arr.length;i++) {
if(s>=arr[i]) {
arr1[i]=s/arr[i];
s=s-(arr[i]*arr1[i]);
}}
for(i=0;i<arr1.length;i++)
System.out.print(""+arr1[i]);
}}