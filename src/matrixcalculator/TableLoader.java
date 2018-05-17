/*************************************************************
 * Programmer: Joseph
 * 
 * Class: CS40S
 * 
 * Assignment: 2 Dimensional array
 * 
 * Input: Comes through parameters
 * 
 * Output: loaded array
 *************************************************************/

package matrixcalculator;

public class TableLoader {
    
    TableClass table = new TableClass();
    
    String strin;
    String delim = "[ ]+";
  
    // initialized constructor 
        // input: table Class
        // returns: none
    public TableLoader (){
        //System.out.println("TableLoader class created");
    }
    
    
    //******************* load table *********************
    
    
    // method that loads a 2D array randomly
        // input: table Class
        // returns: none
    public void loadTable (TableClass t){
       
       // convert following lines into ints based on dimensions
        for(int r = 0; r < t.getRow(); r++){                  // read line
            for(int c = 0; c < t.getCol(); c++){
              // populate array
              t.myBox[r][c] = (int)(Math.random() * 100 + 1);
              
            } // end int c = 0
        } // end int r = 0
 
    } 
    
} // end class
