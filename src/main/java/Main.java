import java.util.ArrayList;

public class Main {

    public static void yell(String words){
        System.out.printf("%s!!! %n", words.toUpperCase());
    }

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("mango");
        fruits.add("orange");
        fruits.add("strawberry");
        //fruits.forEach(f -> System.out.println(f));
       // fruits.forEach(System.out::println);   //method reference


        Main.yell("I want Ice Cream");
        fruits.forEach(Main::yell);


    }
}
