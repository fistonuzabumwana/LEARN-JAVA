class Mathoperation {
    int add (int a, int b){
        return a + b;
    }
    int add (int a, int b, int c) {
        return a+b+c;
    }
    double add (double a, double b){
        return  a + b;
    } 
}


public class Math {
    public static void main(String[] args){
        Mathoperation math = new Mathoperation();

        System.out.println(math.add(3,4));
        System.out.println(math.add(3,4,3));
        System.out.println(math.add(3.4,4.5));
    }
}