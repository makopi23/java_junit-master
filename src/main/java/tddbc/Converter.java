package tddbc;


public class Converter {
	
	public String convert(int src){
		if(src <= 0){
			throw new IllegalArgumentException("引数が0以下です");
		}
		if (isMultiply(src, 15)){
			return "FizzBuzz";
		}
		if( isMultiply(src, 3) ){
			return "Fizz";
		}
		if( isMultiply(src, 5) ){
			return "Buzz";
		}
		return String.valueOf(src);
	}
	
	private boolean isMultiply(int src, int base){
		return src % base == 0;
	}
	
	
}
