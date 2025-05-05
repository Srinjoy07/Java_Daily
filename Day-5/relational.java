class relational {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 2;

        System.out.println(x<y); //true
        System.out.println(y<x); //false

        System.out.println("----------------");
        System.out.println(x>y); //false
        System.out.println(y>x); //true

        System.out.println("----------------");
        System.out.println(x<=y); //true
        System.out.println(y<=z); //false
        
        System.out.println("----------------");
        System.out.println(x>=y); //false
        System.out.println(y>=x); //true

        System.out.println("----------------");
        System.out.println(x==y); //false
        System.out.println(x==z); //true
    }
}
