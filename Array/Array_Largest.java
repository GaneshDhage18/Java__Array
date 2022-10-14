class Array_Largest {
	public static void main(String[] args) 
	{
		int[] a = { 20, 5, 4, 11, 20, 3 };

		int max = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("The largest number is: "+max);
	}
}
