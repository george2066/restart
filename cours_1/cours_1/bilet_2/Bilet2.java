package bilet_2;

public class Bilet2 {
    public static void main(String[] args) {
        String pallindrom = "шала1ш";
        String itog = "pallindrom";
        int j = pallindrom.length() - 1;
        for (int i = 0; i < pallindrom.length(); i++) {
            if (pallindrom.charAt(j) != pallindrom.charAt(i)) {
                itog = "Is not pallindrom";
                break;
            }
            j--;
        }
        System.out.println(itog);
    }
}
