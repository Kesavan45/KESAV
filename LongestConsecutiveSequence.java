import java.util.*;
public class LongestConsecutiveSequence{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int max=0;
int count =1;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n-1;i++){
if(a[i+1]-a[i]==1)
count++;
else
break;
}
System.out.println(count);
}
}