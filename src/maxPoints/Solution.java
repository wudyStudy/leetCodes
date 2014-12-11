package maxPoints;

import java.util.HashMap;

public class Solution {

    public  int maxPoints(Point[] points) {
        
        if(points.length <= 2) {//��������ĿС�ڵ���2����ôһֱ���ϵĵ��������ĳ�����
            return points.length;
        }
        
        double k = 0.0;//б��
        int maxPointNum      = 0;
        int tempMaxPointNum  = 0;
        int samePointNum     = 0;//������ȫ��ͬ��ĸ���
        int parallelPointNum = 0; //��x��ƽ��
        HashMap<Double,Integer> slopeMap = new HashMap<Double,Integer>();
        
        for(int i=0;i<points.length-1;i++) {
           
            samePointNum     = 1; //������ʼ�㣬�ᱻ�ۼ���
            parallelPointNum = 0; 
            tempMaxPointNum  = 0;
            slopeMap.clear();
            
            for(int j=i+1;j<points.length;j++) {
                
                if((points[i].x == points[j].x)&&((points[i].y == points[j].y))) {//������ȫ��ͬ
                    samePointNum++;
                    continue;
                }
               
                if(points[i].x == points[j].x) { //��y��ƽ��
                	
                    parallelPointNum++;
                    
                } else {
                	
                    if(points[i].y == points[j].y) {
                        k = 0;
                    } else {
                        k = ((double)(points[i].y - points[j].y))/(points[i].x - points[j].x);
                    }
                    
                    if(slopeMap.get(k) == null) {//б�ʲ�����
                        slopeMap.put(k, new Integer(1));
                        
                        if(1>tempMaxPointNum) {
                            tempMaxPointNum = 1;
                        }
                    }else {//б���Ѵ���
                        
                        int number = slopeMap.get(k);
                        number++;
                        slopeMap.put(k, new Integer(number));
                        if(number>tempMaxPointNum) {
                            tempMaxPointNum = number;
                        }
                    }
                }
            } 
            
            if(parallelPointNum > 1) {
                if(parallelPointNum>tempMaxPointNum) {
                    tempMaxPointNum = parallelPointNum;
                }
            }
            
            tempMaxPointNum += samePointNum;//������ʼ��;�����ͬ����ĵ�
            
            if(tempMaxPointNum>maxPointNum) {
                maxPointNum = tempMaxPointNum;
            }
        }
        
        return maxPointNum;
    }

}
