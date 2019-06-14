import java.util.Scanner;
public class kTimes{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			boolean flag=true;
			for(int i=0;i<n;i++){
				int c=0;
				for(int j=0;j<n;j++){
					if(a[i]==a[j])
						c++;
				}
				if(c==m){
					System.out.println(a[i]);
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(-1);
		}
	}
}