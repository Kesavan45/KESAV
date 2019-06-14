import java.util.*;
public class maxProductInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			int prod=a[n-1]*a[n-2];
			System.out.println(prod);
		}
	}
}