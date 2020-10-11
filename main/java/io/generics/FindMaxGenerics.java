package io.generics;

public class FindMaxGenerics {
	
		/**
		 * UC 1 Given 3 Integers find the maximum
		 * @param first
		 * @param second
		 * @param third
		 * @return
		 */
	
		public Integer maxNumInt(Integer first, Integer second, Integer third) {
			if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
				return first;
			else if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
				return second;
			else return third;
		}		
		
		
		/**
		 * UC 2 Given 3 Floats find the maximum
		 * @param first
		 * @param second
		 * @param third
		 * @return
		 */
		public Float maxNumFloat(Float first, Float second, Float third) {
			if(first.compareTo(second) > 0 && first.compareTo(third) > 0)
				return first;
			else if(second.compareTo(first) > 0 && second.compareTo(third) > 0)
				return second;
			else return third;
		}
		
		/**
		 * Usecase3
		 * 
		 * @param a
		 * @param b
		 * @param c
		 * @return
		 */
		public String findMaximum(String a, String b, String c) {
			String max;
			if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
				max = a;
			} else if (b.compareTo(c) >= 0 && b.compareTo(a) >= 0) {
				max = b;
			} else {
				max = c;
			}
			return max;
		}
}
	



