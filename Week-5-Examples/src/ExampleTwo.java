
public class ExampleTwo {
	
	public static void main(String[] args) {
	    int number = 1;
	    addThree(number);
	    System.out.println(number);  // prints 1, the value did not change
	}

	public static addThree(int number) {
	    number = number + 3;
	}
	
	/***
	 * Still, the program does not function the way we want. 
	 * The method parameters are different variables than the ones introduced in the main program. 
	 * In the previous example, the method increments a variable with the same name as the main program variable. 
	 * The parameter has the same name, but is not the same as the main program variable number.
     * When a parameter is given to a method, the value of the parameter is copied into a new variable and that new variable is the one the method uses. 
     * In the example above, the variable number that was given to the method addThree as a parameter, will be copied and then the copy is actually handed out for the method to use. 
     * The method uses a copy of the variable from the main program, not the original variable. The main program variable number stays unchanged.
	 */
	  

}
