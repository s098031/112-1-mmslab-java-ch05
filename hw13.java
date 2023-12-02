import java.io.BufferedReader;
import java.io.FileReader;

public class hw13 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("hw12.txt"));
            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println("寫入到檔案中的兩個字串是");
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        } catch (Exception e) {
            System.out.println("輸入出現錯誤");
        }
    }
}