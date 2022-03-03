import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {

public static void main(String[] args) {
    String regex = "^[CAP][1-9]{4}$";
    Pattern pattern = Pattern.compile(regex);
    Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.println("nhap ten lop: ");
        String className = scanner.nextLine();
        if (pattern.matcher(className).find()){
            System.out.println("ten lop hop le");
            break;
        } else {
            System.out.println("ten lop khong hop le");
        }
    }
}
}
