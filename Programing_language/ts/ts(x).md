{

let a = 10; //number型の変数aを宣言し、10を代入
const name: string = "Taro"; //string型の定数nameを宣言し、"Taro"を代入


---------------------------------------------------
let array: number[] = [90, 80, 70];
let fruits: string[] = ["apple", "banana", "orange"];
let goods: { name: string; value: number } = { name: "pen", value: 120 };

---------------------------------------------------
type User = {//構造体みたいなもんの宣言
  id: number;
  name: string;
  isAdmin: boolean;
};

let user1: User = { id: 1, name: "Taro", isAdmin: false };
---------------------------------------------------
console.log(goods.name + ":" + goods.value + "円");//オブジェクトのプロパティにアクセスする方法の例
---------------------------------------------------
// 配列の各要素に対して繰り返し処理を行う方法の例
console.log("=== for文 ===");
for (let i = 0; i < array.length; i++) {
  console.log(array[i]);
}

console.log("\n=== forEach文 ===");
fruits.forEach((fruit) => {//forEach文とは、配列の各要素に対して一度ずつ関数を実行するメソッドです。
  console.log(fruit);
});

---------------------------------------------------
//配列に対する操作の例
a.push(60);//配列に対する要素の追加
a.pop();//配列の最後の要素を削除
a.shift();//配列の最初の要素を削除
a.unshift(100);//配列の最初に要素を追加
a.splice(1, 2);//配列の指定した位置から指定した数の要素を削除
a.slice(1, 3);//配列の指定した範囲の要素を抽出して新しい配列を作成
a.indexOf(80);//配列の中で指定した要素が最初に現れる位置を返す
a.includes(70);//配列の中に指定した要素が含まれているかどうかを調べる
---------------------------------------------------
//関数の定義と呼び出しの例
console.log("=== 関数の定義と呼び出し ===");
function minus(a: number, b:number) {
  return a - b;
}
---------------------------------------------------
//通常の書き方とアロー関数の書き方の例
const add(a: number, b: number): number {
  return a + b;
}
const add = (a: number, b: number): number => a + b;
---------------------------------------------------
//importとexportの例
fs.writeFileSync('output.txt', 'Hello, TypeScript!');//Node.jsの組み込みモジュールであるfsモジュールをimportで取り込む
export importedFunction(){};//ほかのファイルに渡す予定の数は、exportをつけて定義する
import {importedFunction} from './exporter.ts';//上で定義した輸出用の値をimportで取り込む

import * as math from "./export.ts";//ファイル全体をmathという名前でインポートする
---------------------------------------------------
export function mean(a: number | string, b: number | string, precision?: number): number {
  const na = typeof a === "number" ? a : parseFloat(a);
  const nb = typeof b === "number" ? b : parseFloat(b);

  if (Number.isNaN(na) || Number.isNaN(nb)) {
    throw new TypeError("a と b は数値または数値を表す文字列である必要があります");
  }

  const avg = (na + nb) / 2;
  return typeof precision === "number" ? parseFloat(avg.toFixed(precision)) : avg;
}
---------------------------------------------------

}