public class Main {

   public static void main(String []args) {

      // *** 2D ARRAY DATA STRUCTURE *** 
      // like an Array, but a GRID 
      // ROWS are (horizontal) & COLUMNS (vertical)

      // DECLARE a 2D array with double square brackets 
      int[][] experimentData; // null (empty)
      double[][] pointValues; 

      // CREATE/INITIALIZE a 2D array, call constructor 
      experimentData = new int [10][3]; // 10 rows, 3 cols 

      // INTIALIZE a 2D array (declare + create) 
      String[][] seatingChart = new String[4][6];
      // total number of items? 4 x 6 = 24 

      // SET A VALUE by accessing a cell 
      // ACCESS a cell: arrayName[row][col] 
      seatingChart[0][0] = "Mia"; 
      seatingChart[0][5] = "Sohaila"; 
      // 6 cols -> but 5 is FINAL INDEX!!!
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Zach";
      seatingChart[2][1] = "Aaniyah";
      seatingChart[2][3] = "Simeon"; 
      seatingChart[2][4] = "Bowe"; // second to last col 
      seatingChart[3][0] = "Schwartz"; 
      seatingChart[3][1] = "Caleb"; 
      seatingChart[3][2] = "Dolan"; 
      seatingChart[3][3] = "Kyanni"; 
      seatingChart[3][4] = "Danny"; 
      seatingChart[3][5] = "Matthew"; 
      System.out.println(seatingChart[3][5]);  

      // Shortcut: INITIALIZER LISTS 
      // use double curly brackets to set values for a 2D array right away
      String[][] bingo = {
         {"!", "A", "11"} ,
         {"S", "<3", ":"} ,
         {",", "20", "x"}
      };
      // Look at new array 
      System.out.println(bingo); // no built-in toString 
      // have to use a loop or access individual items 
      System.out.println(bingo[0][0]); 
      System.out.println(bingo[1][1]); 
      System.out.println(bingo[1][2]); 


   }
}
