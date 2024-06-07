public class hey{
    public static void main(String[] args){
        String firstname ="fiston";
        String lastname = " uzabumwana";
        int studentid = 2244;
        float studentfees = 56e3f;
        String fullname = firstname + lastname;
        String txt = "Hello my friend echo, how are you today!";
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        String[] cars ={"BMW","TOYOTA","FORD","KIA","HONDA"};
        int[] ages = {22,12,34,56,43,21,98,11,22};
        int lower = ages[0];
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}}; 


        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : numbers){
            for (int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        
        for (int age : ages){
            if (lower > age){
                lower = age;
            }
        }

        System.out.println("lower age: " + lower);


        cars[0]="BENZ";

        for (String i : cars){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i] + " ");
        }

        System.out.println(cars.length);

        System.out.println();
        System.out.println(txt.indexOf("friend"));
        System.out.println("STUDENT NAME: " + firstname.concat(lastname));
        System.out.println("STUDENT NAME: " + fullname.toUpperCase());
        System.out.println("SSTUDENT ID: " + studentid);
        System.out.println("FEES: " + studentfees);
        System.out.println(Math.abs(-4.7));
        System.out.println(result);

    }
}