
public class Calculator {
	
	private int OperandOne;
	private int OperandTwo;
	private int result;
	
	public Calculator(){}
	
	public Calculator(int OperandOne, int OperandTwo){
		this.OperandOne = OperandOne;
		this.OperandTwo = OperandTwo;
	}
	
	public void setOperandOne(int OperandOne){
		this.OperandOne = OperandOne;
	}
	
	public int getOperandOne(){
		System.out.println("Operand one is " + OperandOne);
		return OperandOne;
	}
	
	public void setOperandTwo(int OperandTwo){
		this.OperandTwo = OperandTwo;
	}
	
	public int getOperandTwo(){
		System.out.println("Operand two is " + OperandTwo);
		return OperandTwo;
	}
	
	public void setAddition(){
		result = OperandOne + OperandTwo;
		
	}
	public void setSubtraction(){
		result = OperandOne - OperandTwo;
		
	}
	
	public void getResults(){
		System.out.println("The result of your operation is: " + result);
	}

}
