import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        String s = "12345678";
        int mid = s.length() / 2;
        String[] parts = {
                s.substring(0, mid),
                s.substring(mid),};
        System.out.println(Arrays.toString(parts));
        System.out.println();
        System.out.println("Задача № 2");

            try {
                foo();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public static void foo()throws IOException,FileNotFoundException {

    }
}