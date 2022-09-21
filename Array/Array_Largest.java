class Array_Largest {
	public static void main(String[] args) {
		int[] a = { 200, 5, 4, 11, 20, 3 };
		int count;
		int sum;
		int i;
		int j;
		for (i = 0; i < 5; i++) {
			count = 0;
			sum = 0;
			for (j = 5; j > i; j--) 
			{
				if (a[i] >= a[j]) 
				{
					sum++;
					j--;

					if(sum < a.length)
					{
						System.out.println(a[j] + "is *******largest");
					}
				}	
				
			}
			if (count < a.length ) {
				System.out.println(a[i] + "is the largest");
			} 
			
		}

	}
}
