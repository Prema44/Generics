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
}
	



