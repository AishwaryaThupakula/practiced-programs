
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
	    int m=sc.nextInt();
	    int max=0;
	   ArrayList<Integer> al =new ArrayList<>();
	    for(int i=0;i<n;i++) {
	       al.add(i,0);
	    }
	    System.out.println(al);
		for(int i=0;i<m;i++) {
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int v=sc.nextInt();
		    for(int j=a-1;j<b;j++) {
		      int p=al.get(j)+v;
		       al.set(j,p);
		    }
		    max=Collections.max(al);
		}
		System.out.println(max);
        System.out.println(al);
}
}