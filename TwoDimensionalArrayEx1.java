/*
A distance table  
          Chicago Boston NewYork
  Chicago   0      983    787
  Boston   983     0      214
  NewYork  787    214     0
*/

public class TwoDimensionalArrayEx1{
     public static void main(String []args){
        System.out.println("City Distance Example");
        // Define a matrix representating the distance between cities
        String[] cities = {"Chicago", "Boston", "NewYork"};
        // Define a two-dimensional matrix to represent the distance table
        int[][] distances = {{0, 983, 787}, 
                             {983, 0, 214},
                             {787, 214, 0}};
        // okay however not recommended way to define 2D array;
        int distances2[][];
        // Get distance between Chicago and Boston (access a two dimensional array)
        System.out.println("The distance between Chicago and Boston is ");
        // Is the following method allowed ?
        int distancesver2[][];
        distancesver2 = new int[3][3];
        // Copy distances to distancesver2 (deep copy, not a shallow copy)
        for (int row = 0; row < distances.length; row++){
        // or for (int row=distances.length - 1; row >=0; row--)
            if (distances[0]!=null){ // if distances[0], we assume 
            // if (distances[distances.length - 1] != null)
                for (int col = 0; col <distances[0].length; col++){
                    distancesver2[row][col] = distances[row][col];
                }
            }
        }
               
       // Print out distancesver2 to verify that it is correct
        for (int row = 0; row < distances.length; row++){
            System.out.println();
            if (distances[0]!=null){ // if distances[0], we assume 
                for (int col = 0; col <distances[0].length; col++){
                    System.out.print(distancesver2[row][col] + " ");
                }
            }
        }        
       }
}
