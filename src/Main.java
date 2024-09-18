import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        stringManager object = new stringManager(s.nextLine());
        object.printString();

        Password p = new Password();
        while (p.isLogin() == false){
            System.out.println("input password");
            Scanner t = new Scanner(System.in);
            if(p.checkPassword(t.nextLine())){
                p.setLogin(true);
                System.out.printf("Welcome");
            }
        }

    }
}