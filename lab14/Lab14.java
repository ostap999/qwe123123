import java.util.Scanner;
public class Lab14 {

    public static void main(String[] args) {
        int[] c = new int[args.length];
        for (int i = 0; i < args.length; i++){
            c[i] = Integer.parseInt(args[i]);
        }
        Numbers num = new Numbers(c);
        System.out.println(num.summ());
    }   
}