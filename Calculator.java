public class Calculator {
  public static void main(String[] args){
    if (args.length != 3) {
      System.out.println("Usaage: java Calculator operand1 operator operand2");
      System.exit(1);      
    }
    
    int result = 0;
    
    // Determine the operator
    switch (args[1].charAt(0)) {
      case '+': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
      case '-': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
      case '*': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
      case '/': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);    
    
    }
    
    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
  
  }
