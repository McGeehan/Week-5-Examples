
public class ExampleOne {

	public static void main(String[] args) {
	    int number = 1;
	    addThree();
	    System.out.println("Main program variable number holds the value: " + number);
	}

	public static void addThree() {
	    number = number + 3;
	}
	
	//This program won't work. The reason is that the method cannot access the main program variable number!!
	//This is because the main program variables are not visible to methods..... in a more general sense, no method variable is visible to other methods....
	
	//As the main program is also a method, this constraint holds for the main program as well....
	
	//Due to this, the only way to give information to a method is through parameters....
	
	//Let's hop into the next example.... 
	

}
