class variables {
    public static void main(String[] args) {
        //Declaration --> creating a variable memory
        int num;

        //Initializing --> assigning value to a variable
        num = 10; //this can be written in one line --> int num = 10;

        System.out.println(num);


        System.out.println("--------------------------------------");

        //Re-initializing --> It is to modify the values stored in variable.
        num = 20;
        System.out.println(num);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");


        /* 
           Finding the range of datatypes-- byte(size: 1byete),short(size: 2byte),int(size: 4byte),long(size: 8byte)
           Formula to find this:  -[2^(no. of bits - 1)] to [2^(no. of bits) - 1]
           in Java,we use MIN_VALUE, MAX_VALUE to find out the range
        */
        
        System.out.println(Byte.MIN_VALUE); //-128 
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println("---------------------------------------");

        System.out.println(Short.MIN_VALUE); //-32768 
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println("---------------------------------------");

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println("---------------------------------------");

        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println("---------------------------------------");
        
    }  
}
