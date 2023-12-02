import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class hw12 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("hw12.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            pw.println("Hello!");
            pw.println("GoodBye!");
            pw.close();
            System.out.println("資料已經寫入檔案了");

        } catch (Exception e) {
            System.out.println("輸入出現錯誤");
        }
    }
}