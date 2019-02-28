
public class InsertionSort implements SortingAlgorithm 
{

	@Override
	public void sort(int[] a) 
	{
		int n = a.length;
		
		for(int i = 0;i < n; ++i)
		{
			int temp = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]> temp)
				
			{
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = temp;
		}
	}

}
