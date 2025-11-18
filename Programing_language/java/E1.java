import java.util.Scanner; // (4) Scannerを使うためのimportを追加

public class E1 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        String word = in.next(); 

        System.out.println("");//改行のための出力 

        for (int i = 0; i < n ; i++) { 
            System.out.println(word); 
        }
        
        System.out.println("終了"); 
        
        // 良い慣習として、使い終わったScannerは閉じる
        in.close(); 
    }
}