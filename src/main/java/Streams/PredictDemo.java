package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictDemo implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if(t%2 ==0) {
			return true;
			}else {
				return false;
	}
	}
	
	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredictDemo();
		System.out.println(predicate.test(4));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(predicate).forEach(t->System.out.print(t));

	}

	

	
	

	
	

}
