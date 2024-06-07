public class methods{

    static void mymethods(String fname){
        System.out.println("Welcome " + fname);
    }

    static void checkage(int age){
        if (age > 18){
            System.out.println("ADULT");
        }
        else if (age > 12){
            System.out.println("TEEN");
        }
        else{
            System.out.println("KID");
        }
    }

    public static int sum(int a){
        if( a > 0 ){
            return a + sum(a-1);
        }
        else{
            return 0;
        }
    }


    static int addsums(int x){
        return 5 + x;
    }

    public static void main(String[] args){
        int b = sum(10);
        System.out.println(b);

        mymethods("Fiston");
        mymethods("Eric");
        mymethods("Yves");
        checkage(17);
        System.out.println(addsums(5));

        
    }
}