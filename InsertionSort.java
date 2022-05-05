import java.util.*;
class InsertionSort
	{
	
	void insertion(int a1[])
	{ 
		int n=a1.length;
		for(int i=0;i<n;i++)
		{
		int	k = a1[i];
		int j=i-1;
		
		while(j>=0 && a1[j]>k)
		{
			a1[j+1]=a1[j];
			j=j-1;
		}
		a1[j+1]=k;
		}
	}
	void display(int a1[]){
		int n=a1.length;
		for(int i=0;i<n;i++)
		System.out.print(a1[i]+" ");
	}
	
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{ a[i]=sc.nextInt(); }
	 InsertionSort s1= new InsertionSort();
	 s1.insertion(a);
	 s1.display(a);
		
	}

	}