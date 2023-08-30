import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = "";

        if (n > 4) {
            for (int i = 8; i <= n; i += 4) {
                s += "long ";
            }
        }

        s += "long int";
        System.out.println(s);
    }
}