package calculator;

public class IntegerCalculator extends Calculator {

	protected int currentResult;
	
	public IntegerCalculator(CalculatorView view) {
		super(view);
		this.currentResult = 0;
	}
	
	public IntegerCalculator(CalculatorView view, int currentResult) {
		super(view);
		this.currentResult = currentResult;
	}
	
	public int getIntegerCurrentResult(){
		return this.currentResult;
	}
	
	public void div(int x){
		view.print(currentResult + " / " + x + " = ");
		currentResult /= x;
		view.print(Double.toString(currentResult));
	}

}
