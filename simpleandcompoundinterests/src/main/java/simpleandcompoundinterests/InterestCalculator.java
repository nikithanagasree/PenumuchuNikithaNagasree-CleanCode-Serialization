package simpleandcompoundinterests;

public class InterestCalculator {
	public float calSimpleInterest(float principal,float time,float rate){
		return (principal*time*rate)/100;
	}
	public double calCompoundInterest(float principal,float time,float rate,float number){
		return principal*Math.pow((1+(rate/number)),number*time);	 
	}
		
}
