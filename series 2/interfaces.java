interface Animal {
    public void animalsound();
    public void sleep();
}

class Pig implements Animal {
    public void animalsound() {
        System.out.println("the pig");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class interfaces {
    public static void main(String[] args) {
        Pig mypig = new Pig();

        mypig.animalsound();
        mypig.sleep();
    }
}