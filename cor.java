import java.util.*;
class cor {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
String s2=in.nextLine();
char [] arr=new char[256];
System.out.println();
for(int i=0;i<s2.length();i++)
{
arr[s2.charAt(i)]++;
}
String Str =" ";
for(int i=0;i<s1.length();i++)
{

if(arr[s1.charAt(i)] == 0)
{
Str+=s1.charAt(i);
}
}
System.out.println(Str.trim());
}
}
