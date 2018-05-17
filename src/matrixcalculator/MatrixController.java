/*************************************************************
 * Programmer: Joseph
 * 
 * Class: CS40S
 * 
 * Assignment: Matrix Calculator
 * 
 * Purpose: Act as the controller for my project
 * 
 * Input: comes from the view and model
 * 
 * Output: Output will vary
 *************************************************************/

package matrixcalculator;

public class MatrixController {
    
    MatrixView pointer;   // view pointer      
    
    // addition section
    TableClass t1Add = new TableClass();
    TableClass t2Add = new TableClass();
    TableClass t3Add = new TableClass();
    
    // subtraction section
    TableClass t1Sub = new TableClass();
    TableClass t2Sub = new TableClass();
    TableClass t3Sub = new TableClass();
    
    // product section
    TableClass t1Prod = new TableClass();
    TableClass t2Prod= new TableClass();
    TableClass t3Prod= new TableClass();
    
    // transposition section
    TableClass t1Transpose = new TableClass();
    TableClass t2Transpose = new TableClass();
    
    TablePrinter print = new TablePrinter();
    TableCalculator calculate = new TableCalculator();
    TableLoader load = new TableLoader();
    

    // Purpose: register view
        // Input: view address
        // Output: none
            
            public void registerView (MatrixView m) {
              
                pointer = m;
            } // end registerView
    
     // Purpose: fill add pane 1
        // Input: row and column
        // Output: filled array
          
        public int [][] addPane1(int r, int c){
            t1Add.setRow(r);
            t1Add.setCol(c);
            
            load.loadTable(t1Add);
            print.printMatrix(t1Add);
            
            return t1Add.myBox;
        }
        
     // Purpose: fill add pane 2    
        // Input: row, column
        // Output: filled array
              
        public int [][] addPane2(int r, int c){
            t2Add.setRow(r);
            t2Add.setCol(c);
            
            load.loadTable(t2Add);
            
            print.printMatrix(t2Add);
            
            return t2Add.myBox;
        }
        
    // Purpose: Calculate Addition  
        // Input: none
        // Output: sum array
              
        public int [][] calculateAdd(){
            
            t3Add.myBox = calculate.matrixSum(t1Add, t2Add);
            t3Add.setRow(t1Add.getRow());
            t3Add.setCol(t1Add.getCol());
            
            return t3Add.myBox;
        } // end claculateAdd
        
        
        // Subtract section
        
    // Purpose: fill sub pane 1
        // Input: row and column
        // Output: filled array
          
        public int [][] subPane1(int r, int c){
            t1Sub.setRow(r);
            t1Sub.setCol(c);
            
            load.loadTable(t1Sub);
            print.printMatrix(t1Sub);
            
            return t1Sub.myBox;
        }
        
    // Purpose: fill sub pane 2    
        // Input: row, column
        // Output: filled array
              
        public int [][] subPane2(int r, int c){
            t2Sub.setRow(r);
            t2Sub.setCol(c);
            
            load.loadTable(t2Sub);
            
            print.printMatrix(t2Sub);
            
            return t2Sub.myBox;
        }
        
    // Purpose: Calculate Subtraction
        // Input: none
        // Output: difference array
              
        public int [][] calculateSub(){
            
            t3Sub.myBox = calculate.matrixDif(t1Sub, t2Sub);
            t3Sub.setRow(t1Sub.getRow());
            t3Sub.setCol(t1Sub.getCol());
            
            return t3Sub.myBox;
        } // end calculateSub
        
    // Purpose: fill product pane 1   
        // Input: row, column
        // Output: filled array
              
        public int [][] prodPane1(int r, int c){
            t1Prod.setRow(r);
            t1Prod.setCol(c);
            
            load.loadTable(t1Prod);
            
            print.printMatrix(t1Prod);
            
            return t1Prod.myBox;
        }
        
    // Purpose: fill product pane 2   
        // Input: row, column
        // Output: filled array
              
        public int [][] prodPane2(int r, int c){
            t2Prod.setRow(r);
            t2Prod.setCol(c);
            
            load.loadTable(t2Prod);
            
            print.printMatrix(t2Prod);
            
            return t2Prod.myBox;
        }
        
    // Purpose: Calculate multiplication
        // Input: none
        // Output: product array
              
        public int [][] calculateProd(){
            
            t3Prod.myBox = calculate.matrixProduct(t1Prod, t2Prod);
            t3Prod.setRow(t1Prod.getRow());
            t3Prod.setCol(t2Prod.getCol());
            
            return t3Prod.myBox;
        } // end calculateProd
        
    // Purpose: fill transposition pane 1   
        // Input: row, column
        // Output: filled array
              
        public int [][] transposePane1(int r, int c){
            
            t1Transpose.setRow(r);
            t1Transpose.setCol(c);
            
            load.loadTable(t1Transpose);
            
            print.printMatrix(t1Transpose);
            
            return t1Transpose.myBox;
        }
        
    // Purpose: Transpose Table
        // Input: none
        // Output: transposed array
              
        public int [][] transpose(){
            
            t2Transpose.myBox = calculate.matrixTransposer(t1Transpose);
            t2Transpose.setRow(t1Transpose.getCol());
            t2Transpose.setCol(t1Transpose.getRow());
            
            return t2Transpose.myBox;
            
        } // end transpose
        
}
