package maxPoints;

import java.util.Random;

public class SolutionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point []pointArr = new Point[100];
		for(int index = 0;index < 100;index++){
			Point point = new Point(index,new Random(index).nextInt());
			pointArr[index] = point;
			System.out.println("Point("+point.x+","+point.y+")");
		}
		System.out.println(new Solution().maxPoints(pointArr));
	}

}
