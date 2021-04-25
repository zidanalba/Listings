package Task_3;

public interface Sort {
	int compare(Employee b);
	static void shell_sort(Employee[] a)
	{
		int len = a.length;
		
		// From geeks to geeks
		for (int gap = len/2; gap > 0; gap /= 2)
		{
			for (int i = gap; i < len; i++)
			{
				Employee temp = a[i];
				
				int j;
				for(j = i; j >= gap && (a[j - gap].compare(temp)) < 0; j -= gap)
					a[j] = a[j - gap];
				
				a[j] = temp;
			}
		}
	}
}
