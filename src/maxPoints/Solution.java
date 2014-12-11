package maxPoints;

import java.util.HashMap;

public class Solution {

    public  int maxPoints(Point[] points) {
        
        if(points.length <= 2) {//如果点的数目小于等于2，那么一直线上的点就是数组的长度了
            return points.length;
        }
        
        double k = 0.0;//斜率
        int maxPointNum      = 0;
        int tempMaxPointNum  = 0;
        int samePointNum     = 0;//坐标完全相同点的个数
        int parallelPointNum = 0; //与x轴平行
        HashMap<Double,Integer> slopeMap = new HashMap<Double,Integer>();
        
        for(int i=0;i<points.length-1;i++) {
           
            samePointNum     = 1; //代表起始点，会被累加上
            parallelPointNum = 0; 
            tempMaxPointNum  = 0;
            slopeMap.clear();
            
            for(int j=i+1;j<points.length;j++) {
                
                if((points[i].x == points[j].x)&&((points[i].y == points[j].y))) {//坐标完全相同
                    samePointNum++;
                    continue;
                }
               
                if(points[i].x == points[j].x) { //与y轴平行
                	
                    parallelPointNum++;
                    
                } else {
                	
                    if(points[i].y == points[j].y) {
                        k = 0;
                    } else {
                        k = ((double)(points[i].y - points[j].y))/(points[i].x - points[j].x);
                    }
                    
                    if(slopeMap.get(k) == null) {//斜率不存在
                        slopeMap.put(k, new Integer(1));
                        
                        if(1>tempMaxPointNum) {
                            tempMaxPointNum = 1;
                        }
                    }else {//斜率已存在
                        
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
            
            tempMaxPointNum += samePointNum;//加上起始点和具有相同坐标的点
            
            if(tempMaxPointNum>maxPointNum) {
                maxPointNum = tempMaxPointNum;
            }
        }
        
        return maxPointNum;
    }

}
