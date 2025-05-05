class logical {
      public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 2;

        //OR
        System.out.println( (x<y) || (y>z) ); //true
        System.out.println( (y>x) || (z<x) ); //true
        System.out.println( (y<x) || (y<z) ); //false

        System.out.println("-----------------------------");

        //AND
        System.out.println( (x<y) && (y>z) ); //true
        System.out.println( (y>x) && (z<x) ); //true
        System.out.println( (y<x) && (y<z) ); //false


        System.err.println("-----------------------------");

        //NOT
        System.err.println(!true); //false
        System.err.println(!false); //true
        System.err.println(!(x<y)); //false
        System.err.println(!(x>y)); //true


        //in logical AND operator if first operand is false then compiler never checks the other operand 
        // logical NOT is an unary operator
      }    
}
