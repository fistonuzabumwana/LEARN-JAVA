abstract class abst{
    public String fname ="john";
    public int age = 24;
    public abstract void study();

    public static void main(String[] args) {
        
    }
}

class Student extends abst {
    public int graduationyear = 2018;
    @Override
    public void study() {
        System.out.println("Studying all day long");
    }
}
