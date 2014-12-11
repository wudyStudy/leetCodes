package MaximumSubArray;

public class SolutionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array1 = {0,2,3,5,6,8,0,9};
		int []array2 = {1,-2,-3,-5,6,8,0,9};
		int []array3 = {1,2,-3,5,6,8,0,9};
		int []array4 = {1,2,0,5,6,8,0,9};
		
		System.out.println(new Solution().maxProduct(array1));
		System.out.println(new Solution().maxProduct(array2));
		System.out.println(new Solution().maxProduct(array3));
		System.out.println(new Solution().maxProduct(array4));
	}

}
