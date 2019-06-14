import java.util.*;
public class twiceCount
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String t=s.nextLine();
	String e[]=t.split(" ");
	int count,flag=0,i,j;

	for(i=0;i<e.length;i++){
count=0;
if(!e[i].equals("")){

for(j=i+1;j<e.length;j++){
if(e[i].equals(e[j])){

count++;
e[j]="";
}
if(count==1)
flag++;
}	
}
}
	
	System.out.println(flag);
}
}

