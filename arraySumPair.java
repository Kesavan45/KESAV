import java.util.*;
public class arraySumPair{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]+a[j]==m)
System.out.println(a[i]+" "+a[j]);
}
}
}
}
