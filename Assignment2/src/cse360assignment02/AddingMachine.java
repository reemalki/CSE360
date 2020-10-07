package cse360assignment02;

public class AddingMachine {
	 private int total;
	 StringBuffer history; 
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = new StringBuffer("0");
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total+=value;
		  history.append(" + " + value);
	  }

	  public void subtract (int value) {
		  total-=value;
		  history.append(" - " + value);

	  }

	  public String toString () {
	    return history.toString();
	  }

	  public void clear() {
		  history.delete(0, history.length());
		  total = 0;
	  }

}
