package QuizSolution;

public class UseStatic
{

    static String name= "james william";

    public static void display(){
        System.out.println("This is Display Method");
    }


    public static void main(String[] args) {

        UseStatic.name = "Jack";
        System.out.println(UseStatic.name);
        UseStatic.display();
    }
}
