/*
Finding the closest pair 
Enter a number of points, and find the two closest pair of points 
This one show how to scan into 6 points
*/

import java.util.Scanner;

public class FindClosestPair {

     public static void main(String []args){
        // Define a scannner, explain this one 
        // Please refer https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        int numPointDimension = 2; 
        Scanner scanner = new Scanner(System.in); 
        // get the number of points
        System.out.println("Please enter the number of 2D points: ");
        int numpoints = scanner.nextInt();
        // For each point, get the inputs of its x-value and y-value 
        int[][] points = new int[numpoints][2];
        for (int indexp = 0; indexp < numpoints; indexp++){
            for (int indexaxis = 0; indexaxis < numPointDimension; indexaxis++){
                points[indexp][indexaxis] = scanner.nextInt();
            }
        }
        
        // Use a brute-force method to find the pair of points - extra memory used to remember this two points
        int[] closestpoint1 = new int[2];
        int[] closestpoint2 = new int[2];
        
        int closestDistance = Integer.MAX_VALUE;
        
        for (int firstpoint = 0; firstpoint < numpoints - 1; firstpoint++){
            for (int secondpoint = firstpoint + 1; secondpoint < numpoints; secondpoint++){
                int curdistance = (int)Math.pow((points[firstpoint][0] - points[secondpoint][0]), 2)
                                + (int)Math.pow((points[firstpoint][1] - points[secondpoint][1]), 2);
                if (curdistance < closestDistance){
                    closestDistance = curdistance;
                    // remember these two numpoints; this is a shallow copy
                    closestpoint1 = points[firstpoint];
                    closestpoint2 = points[secondpoint];
                }               
            }
        }
        
        System.out.println("Cloest distance is " + Math.sqrt(closestDistance));
        System.out.println("These closest two points are : ");
        System.out.println("["+closestpoint1[0] + ", " + closestpoint1[1]+"]");
        System.out.println("["+closestpoint2[0] + ", " + closestpoint2[1]+"]");                
        // Output these two points
        
        return;  
    }
}
