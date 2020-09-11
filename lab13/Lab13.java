import java.util.Scanner;
public class Lab13 {

    public static void main(String[] args) {
        Users user = new Users(args[0], args[1]);
        user.pass(args[2]);
    }
}