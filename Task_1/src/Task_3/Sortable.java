package Task_3;

public abstract class Sortable {
	public abstract int compare(Sortable b);
	 public static void shell_sort(Sortable[] a)
	 {
		//Shell sort body
		int len = a.length;
		
		for (int gap = len/2; gap > 0; gap /= 2)
		{
			for (int i = gap; i < len; i++)
			{
				Sortable temp = a[i];
				
				int j;
				for(j = i; j >= gap && (a[j - gap].compare(temp)) < 0; j -= gap)
					a[j] = a[j - gap];
				
				a[j] = temp;
			}
		}
	 }
}
