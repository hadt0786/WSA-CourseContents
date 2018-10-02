 

public class NumberSorting {

	public static void main(String args[])
	{
		int num[]={55,12,78,64,3};
		int n=num.length;
		System.out.println("Given list");
		for(int i=0;i<n;i++)
		{
			System.out.println("  "+num[i]);
			
		}
	System.out.println("");
	//sorting 
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(num[i]>num[j])
			{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			
		}
	}
	System.out.println("Sorted list is");
	for(int i=0;i<n;i++)
	{
		System.out.println("  "+num[i]);
		
	}
	System.out.println("");
	}
	
	}
