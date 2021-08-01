import java.io.InputStream;
import java.text.NumberFormat;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String string = null;
        try {
            char chr = string.charAt(20);
            string.toString();
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        System.out.println("Это нулевая строка");

        try {
            Scanner sc = new Scanner(InputStream.nullInputStream());
            int[] arr = new int[1];
            arr[0]=sc.nextInt();
            int b = arr[2];

           } catch ( NoSuchElementException| ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Завершили успешно!");
        }
        }
    }


