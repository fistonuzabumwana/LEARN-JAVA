class abst2 {
    public static void main(String[] args) {
        Student myobj = new Student();

        System.out.println("Name: " + myobj.fname);
        System.out.println("Age: " + myobj.age);
        System.out.println("Graduation Year: " + myobj.graduationyear);
        myobj.study();
    }
}