package MaximumSubArray;

public class Solution {

	 public int maxProduct(int[] A) {
		 
		 if(A == null||A.length==0){
			 return 0;
		 }
		 int maxProduct = A[0];  //最大值的初始值
         int maxTemp   = A[0]; //累积的最大值 
         int minTemp  = A[0];  //累积的最小值
	          
         for(int i = 1;i < A.length;i++) {//从数组的第二个元素开始遍历
        	 
            int a = A[i]*maxTemp;  
            int b = A[i]*minTemp;  
            maxTemp = Math.max(Math.max(a,b), A[i]);//选取最大值的新起点  
            minTemp = Math.min(Math.min(a,b), A[i]);//选取最小值的新起点  
            maxProduct = Math.max(maxProduct, maxTemp);//更新最大值  
         }  
          return maxProduct;
	    }

}
