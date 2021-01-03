import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Splice {
    public static void main(String[] args) {

        try {
            FileInputStream one = new FileInputStream("1doc.txt");
            FileInputStream two = new FileInputStream("2doc.txt");
            FileOutputStream fos = new FileOutputStream("splice.txt");
            int text;

            while ((text = one.read()) != -1) {
                System.out.print((char) text);
                fos.write(text);
            }
            one.close();

            while ((text = two.read()) != -1) {
                System.out.print((char) text);
                fos.write(text);
            }
            two.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
