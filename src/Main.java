import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        stringManager object = new stringManager(s.nextLine());
        object.printString();
    }
}