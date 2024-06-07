public class classes {
    int x = 3;
    final int z = 10;
    String fname = "uzabumwana";
    int age = 24;

    public classes(int c){
        x = c;
    }

    static void exam(){
        System.out.println("hello");
    }

    public void exam2(){
        System.out.println("hi");
    }

    public static void main(String[] args){
        classes obj = new classes(20);
        

        exam();
        obj.exam2();

        System.out.println(obj.x);
        System.out.println("Name: " + obj.fname + " and age: " + obj.age);

    }
}