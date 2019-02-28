import java.util.Arrays;


public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) 
	{
		// TODO Auto-generated method stub
		if(a.length>1)
		{
		int left[] =  getLeft(a);
		int right[] = getRight(a);
		
		sort(left);
		sort(right);
		merge(a,left,right);
		}
	}

	private void merge(int[] a, int[] left, int[] right) {
		// TODO Auto-generated method stub
		
		int ai= 0;
		int ri =  0;
		int li = 0;
		
		while(li < left.length && ri < right.length)
		{
			if(left[li] < right[ri])
			{
				a[ai++] = left[li++];
			}
			else 
			{
				a[ai++] = right[ri++];
			}
		}
		
		while(ri < right.length)
		{
			a[ai++]= right[ri++];
		}
		
		while(li< left.length)
		{
			a[ai++] =left[li++];
		}
		
		
	}


	private int[] getRight(int[] a) {
		// TODO Auto-generated method stub
		
		return Arrays.copyOfRange(a,(a.length/2), a.length );
	}

	private int[] getLeft(int[] a) {
		// TODO Auto-generated method stub
		return Arrays.copyOfRange(a, 0, (a.length/2));
	}

}
