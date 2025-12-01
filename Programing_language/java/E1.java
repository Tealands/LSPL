import java.util.Scanner; // (4) Scannerを使うためのimportを追加

public class E1 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("繰り返し回数を入力して下さい。:");
        int n = in.nextInt(); 
        String word = in.next(); 

        System.out.println("");//改行のための出力 

        for (int i = 0; i < n ; i++) { 
            System.out.println(word); 
        }        
        // 良い慣習として、使い終わったScannerは閉じる
        in.close(); 
    }
}