
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) 
	{
		// TODO Auto-generated method stub
		quicksort(a,0,a.length-1);

	}

	private void quicksort(int[] a, int left, int right) 
	{
		// TODO Auto-generated method stub
		if(left < right)
		{
			int part = partition(a,left,right);
			quicksort(a,left,part-1);
			quicksort(a,part+1,right);
		}
		
	}

	private int partition(int[] a, int left, int right) 
	{
		// TODO Auto-generated method stub
		if(left < right)
		{
			int pivot = left;
			int i = left +1;
			int j = right;
			while ( i < j)
			{
				while(i <= right && a[i] <= a[pivot])
				{
					++i;
				}
				while(j >= i && a[j] > a[pivot])
				{
					--j;
				}
				
				if(i <= right && i < j)
				{
					swap(a,i,j);
				}
				
			}
			swap(a,pivot,j);
			return j;
		}
		return left;
	}

	private void swap(int[] a, int i, int j) 
	{
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
