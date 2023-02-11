package com.test;

/*
 * Array of [2,7,8,3,1] target=15
 */
public class SumOfTwo {

	public static void main(String[] args) {
		int[] num = { 2, 7, 8, 3, 1 };
		int target = 15;
		int delta = 0;

		/*
		 * Map myMap = new HashMap(); for (int i = 0; i < num.length; i++) { delta =
		 * target - num[i]; if (myMap.containsKey(delta)) {
		 * System.out.println("Result:[" + myMap.get(delta) + "," + i + "]"); break; }
		 * else { myMap.put(num[i], i); } }
		 */
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					System.out.println("["+i+","+j+"]");	
				}
			}
		}
	}
}
