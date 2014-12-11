package MaximumSubArray;

public class Solution {

	 public int maxProduct(int[] A) {
		 
		 if(A == null||A.length==0){
			 return 0;
		 }
		 int maxProduct = A[0];  //���ֵ�ĳ�ʼֵ
         int maxTemp   = A[0]; //�ۻ������ֵ 
         int minTemp  = A[0];  //�ۻ�����Сֵ
	          
         for(int i = 1;i < A.length;i++) {//������ĵڶ���Ԫ�ؿ�ʼ����
        	 
            int a = A[i]*maxTemp;  
            int b = A[i]*minTemp;  
            maxTemp = Math.max(Math.max(a,b), A[i]);//ѡȡ���ֵ�������  
            minTemp = Math.min(Math.min(a,b), A[i]);//ѡȡ��Сֵ�������  
            maxProduct = Math.max(maxProduct, maxTemp);//�������ֵ  
         }  
          return maxProduct;
	    }

}
