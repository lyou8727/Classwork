package copyarrays;

public class BinarySearch {

	public static void main(String[] args)
	{
		//int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		//int[] test2 = {0,4,5,6,12,15,17,23,29};
		 
		int[] test3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] test4 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		
		//System.out.println(binarySearch(test1, 3, 0, test1.length));
		//System.out.println(binarySearch(test2, 23, 0, test2.length));
		//System.out.println(binarySearch(test1, 1, 0, test1.length));
		//System.out.println(binarySearch(test2, 25, 0, test2.length));
		
		for (int i = -1; i< test3.length+1; i++)
		{
			System.out.print(binarySearch(test3,i,0,test3.length)+" ");
		}
		System.out.println();
		for (int i = -1; i< test4.length+1; i++)
		{
			System.out.print(binarySearch(test4,i,0,test4.length)+" ");
		}
		System.out.println();
		
	}
	
	public static int binarySearch(int[] nums, int query, int first, int last)
	{
		if(first < last /*last>= first*/)
		{
			int index = (first+last)/2;
			int guess = nums[index];
			
			if (guess == query)
			{
				return index;
			}
			
			if(guess>query)
			{
				//return binarySearch(nums,query,first,index-1);
				return binarySearch(nums,query,first,index);				
			}
			//return binarySearch(nums,query,first,index+1);
			return binarySearch(nums, query, index+1, last);
		}
		return -1;
	}

}
