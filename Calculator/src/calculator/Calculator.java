package calculator;

public class Calculator {

	protected Double 			currentResult;
	protected CalculatorView 	view;
	
	public Calculator(CalculatorView view){
		this.view = view;
		this.currentResult = new Double(0);
	}
	
	public Calculator(CalculatorView view, Double currentResult){
		this.view = view;
		this.currentResult = currentResult;
	}
	
	public Double getCurrentResult(){
		return this.currentResult;
	}
	
	public void add(double x){
		view.print(currentResult + " + " + x + " = ");
		currentResult += x;
		view.print(Double.toString(currentResult));
	}
	
	public void sub(double x){
		view.print(currentResult + " - " + x + " = ");
		currentResult -= x;
		view.print(Double.toString(currentResult));
	}
	
	public void mult(double x){
		view.print(currentResult + " * " + x + " = ");
		currentResult *= x;
		view.print(Double.toString(currentResult));
	}
	
	public void div(double x){
		view.print(currentResult + " / " + x + " = ");
		currentResult /= x;
		view.print(Double.toString(currentResult));
	}
	
	public void integerDiv(Integer x){
		Integer integerCurrentResult = this.currentResult.intValue();
		view.print(integerCurrentResult + " / " + x + " = ");
		integerCurrentResult /= x;
		view.print(Double.toString(integerCurrentResult));
		this.currentResult = integerCurrentResult.doubleValue();
	}
	
}
