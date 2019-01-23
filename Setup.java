import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    Bridges bridges = new Bridges(0, "dannhardtam", "134974691093");

	    /* Set an assignment title */
	    bridges.setTitle("Alexandria Dannhardt");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    arr.getElement(0).setValue (0);
	
	    //Element square = new Element<Integer>();  
	    for (int i =0; i<arraySize; i++) {
	    	//square.setValue(i*i);
	    	//arr.setElement(i, square); 
	    	//System.out.println(i + " AND THE CONTAINER: " + arr.getElement(i));
		    arr.getElement(i).setLabel(String.valueOf(i*i));
		    
	    }
	   
	    /* set the value as a Label */

	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
