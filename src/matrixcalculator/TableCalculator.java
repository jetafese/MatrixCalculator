package matrixcalculator;

/*************************************************************
 * Programmer: Joseph
 * 
 * Class: CS40S
 * 
 * Assignment: 2 Dimensional array
 * 
 * Input: data will be passed in as parameters
 * 
 * Output: sum and average
 *************************************************************/

public class TableCalculator {

    // default constructor
        // none
        // no output
    public TableCalculator(){
      // System.out.println("Table Calculator Created");
    }
 
    // sum calculator 
        // input table class
        // returns: sum of table
    public int [][] matrixSum (TableClass t1, TableClass t2){
        
        int [][] sumArray = new int [t1.getRow()][t1.getCol()];
        
        for(int r = 0; r < t1.getRow(); r++){
            for(int c = 0; c < t1.getCol(); c++){
                
                sumArray[r][c] = t1.myBox[r][c] + t2.myBox[r][c];
           
            } // end int c = 0  
        } // end int r = 0
        
        return sumArray;
    }
    
    // difference calculator 
        // input: 2 table classes
        // returns: difference table
    public int [][] matrixDif (TableClass t1, TableClass t2){
        
        int [][] difArray = new int [t1.getRow()][t1.getCol()];
        
        for(int r = 0; r < t1.getRow(); r++){
            for(int c = 0; c < t1.getCol(); c++){
                
                difArray[r][c] = t1.myBox[r][c] - t2.myBox[r][c];
           
            } // end int c = 0  
        } // end int r = 0
        
        return difArray;
    }

    
    // matrix product calculator
        // input: table class
        // returns: product array
    public int [][] matrixProduct (TableClass t1, TableClass t2){
        
        int [][] productArray = new int [t1.getRow()][t2.getCol()];
        int sum = 0;
        
        for(int r = 0; r < t1.getRow(); r++){
            
            for(int c = 0; c < t2.getCol(); c++){
                
                for(int x = 0; x < t2.getRow(); x++){
                     sum = sum + t1.myBox[r][x] * t2.myBox[x][c];
               } // end for x = 0
 
               productArray[r][c] = sum;
               sum = 0;
               
            } // end for c = 0
            
                } // end for r = 0
        
        
        return productArray;
    }
    
    // matrix transposer
        // input: table class
        // returns: transposed table
    public int [][] matrixTransposer (TableClass t){
        
        int [][] transposedArray = new int [t.getCol()][t.getRow()];
        
        for(int r = 0; r < t.getCol(); r++){
            for(int c = 0; c < t.getRow(); c++){
                
                transposedArray[r][c] = t.myBox[c][r];
           
            } // end int c = 0  
        } // end int r = 0
        
        return transposedArray;
    }
    
    
    
} // end class