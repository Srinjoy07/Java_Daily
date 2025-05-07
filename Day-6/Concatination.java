class Concatination {
    public static void main(String[] args) {

        System.out.println(1 + 2); //3 (+ operator is acting like addition operator)
        System.out.println('a' + 2); //99 (num + char --> number)
        System.out.println('a' + 'a'); //194..ASCII of a + ASCII of a
        //System.out.println(1 + true); //num + boolean --> not possible
        //System.out.println(true + false); // boolean + boolean --> not possible
        System.out.println("Sheela" + 123); //Sheela123, string + number --> String(Concatination)
        System.out.println("Srinjoy" + " " + "Rituja");  //string + String --> String(concatination)
        System.out.println(1 + "Sheela" + 20 + 30); 
        //System.out.println(1 + "Sheela" + 20 - 10); //error: after concatination it won't accept any minus
        System.out.println(1 + "Sheela" + (10 + 20)); //1Sheela30...first expression is executed,then string is concatinated
        System.out.println(1 + "Sheela" + (20-10)); //here minus is allowed because the whole is taken as an EXPRESSION


        //experiments
        String blank = " ";
        System.out.println("Hi" + blank + "I" + blank + "am" + blank + "Srinjoy");

        byte a1 = 20;
        byte b1 = 30;
        System.out.println("The value of a + b is: " + (a1 + b1));


        String name = "Srinjoy";
        String institute = "Jspiders";
        int marks = 9;
        String collegeName = "CIEM";
        String gender = "male";
        long phoneNumber = 9674058734l;
        System.err.println("Hello,myself " + name + "." + "I am studying in " + institute + ". I have scored" + marks + " in my " + collegeName + ".");
        System.err.println("As a " +  gender + "candidate I know my roles and responsibilities.");
        System.err.println("I don't want to disclose my number " + phoneNumber + " as it can be misused");



    }
}
