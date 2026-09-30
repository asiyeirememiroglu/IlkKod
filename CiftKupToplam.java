public class CiftKupToplam {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                toplam += i * i * i;
            }
        }

        System.out.println("1-20 arasindaki cift sayilarin kuplerinin toplami: " + toplam);
    }
}