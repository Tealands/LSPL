class FirstExample {//これがコンパイル後の実行ファイル名となる。だからこのような関数を複数作ると一気に複数の実行ファイルが作られる
 public static void main(String[] args) {
 System.out.println("こんにちは");//文末は；で終わる
 }
 }
------------------------------------------------------------
//入力の例
import java.util.Scanner;//Scannerを使うための宣言 
import java.util.*;

Scanner in = new scanner(System.in);//Scaneer型の宣言
String name = in.nextline();//nextで入力を受け取る。(今回はString)
int height = in.nextInt();//nextで入力を受け取る(今回はint)
double weight = in.nextDouble();//nextで入力を受け取る(今回はdouble)
boolean isStudent = in.nextBoolean();//nextで入力を受け取る(今回はboolean)
in.close();//終わったらScannerは閉じる
------------------------------------------------------------
//宣言の例
int a = 10;//型宣言のときは小文字でいい
double b = 3.14;
char c = 'A';
boolean d = true;
int[] scores = {85, 90, 78, 92};
int[] input = new int[10];//空の配列の宣言
String[] nations = {"United State", "China", "Germany", "Japan"}
str.Charat(i);//配列のi番目の要素を取得
------------------------------------------------------------
//コマンドライン引数の例
public main {
 public static void main(String[] args) {//メソッドを分けて定義
  args.length; // コマンドライン引数の数
  args[0];    // 最初のコマンドライン引数
 }   
 public static void main(String[] args) {//メソッドを分けて定義
  for (int i = 0; i < args.length; i++) {
   System.out.println("Argument " + i + ": " + args[i]);//printInではない
  }
 }
}
------------------------------------------------------------
//構造体の宣言
    public Employee(int number, int id, String name) {
        this.number = number;
        this.id = id;
        this.name = name;
    }

//構造体の追加
Employee newMember = new Employee(counter, id, name);

//構造体の配列
 List<Employee> employeeList = new ArrayList<>();
------------------------------------------------------------
do {
 // 繰り返し実行する処理
} while (条件);//条件がtrueの間繰り返す。だから最低1回は実行される
------------------------------------------------------------
//ソートの例
for (int i = 0; i < array.length - 1; i++) {
    for (int j = 0; j < array.length - 1 - i; j++) {//ここのintは小文字でいい
        if (array[j] > array[j + 1]) {
            // 要素の交換
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
------------------------------------------------------------
//文字列の比較
if(command.equals("make"))//文字列が"make"かどうかの判定を行う
------------------------------------------------------------
//型変換
Integer.parseInt(A);//IntではないAをInt型に変換する。

------------------------------------------------------------
//try-catchの使い方
try {
    // 例外が発生する可能性のあるコード（例外を監視するブロック）
} catch (例外の型 変数名) {
    // 例外が発生した場合に実行する処理（例外を捕捉して処理するブロック）
}

//例
String input = "abc"; // ユーザーが誤って数字ではない文字列を入力したと仮定

try {
    int number = Integer.parseInt(input); // ここで例外（NumberFormatException）が発生する可能性がある
    System.out.println("変換された数値: " + number);
} catch (NumberFormatException e) { // 数値への変換に失敗した例外を捕捉
    System.err.println("aは実数を表す文字列を入力してください。");
}

//ユーザーの入力補正に使いやすそう。
------------------------------------------------------------
//Thisの使い方

public class Person {
    private String name; // メンバー変数（フィールド）

    // コンストラクタ
    public Person(String name) {
        // this.name は「このオブジェクトのメンバー変数 name」を指す。つまりPerson.nameと書くのと同じ
        // name は「引数として渡された name」を指す
        this.name = name; 
    }

    public void display() {
        System.out.println("名前: " + this.name); // メンバー変数を参照
    }
}

------------------------------------------------------------
//継承の使いかた
class B extends A {//クラスBがクラスAを継承する場合クラスBの宣言に「B extends A」と記す



}




