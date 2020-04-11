import java.net.StandardSocketOptions;

public class PracticeModel {

    public static void main(String... args){
        System.out.println("Works");

        boolean flag = allFunctions();

        if (flag){
            System.out.println("True");
        }else{

        testMethod();
        }
    }

    public static void testMethod(){
        System.out.println("Test");
    }

    static boolean allFunctions() {
        System.out.println(function1() + " " + function2() + " " + function3());
        return true;
    }
    static String function1() {
        return "function1";
    }
    static String function2() {
        return "function2";
    }
    static String function3() {
        return "function3";
    }
}
