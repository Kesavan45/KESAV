import java.util.*;
class caps{
public static void main(String args[]) {
String a;
int i;
Scanner t=new Scanner(System.in);
a=t.nextLine();
char ch[]=a.toCharArray();
ch[0]=(char)(ch[0]-32);
for(i=0;i<ch.length;i++)
{
if(ch[i]==' ')
{
ch[i+1]=(char)(ch[i+1]-32);
}
}
for(i=0;i<ch.length;i++)
{
System.out.print(ch[i]);
}
}
}