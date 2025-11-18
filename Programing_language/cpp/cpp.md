#include <bits/stdc++.h>// すべての標準ライブラリをインクルード
#include <string>// 文字列操作に必要
#include <iostream>// 入出力に必要
#include <fstream> // ファイル操作に必要
#include <atcoder/all>//atcoderのすべての関数が使える
----------------------------------
using namespace std; // 言語の設定
using ll = long long; // llをlong longの別名として定義
using pii = pair<int, int>; // piiをpair<int, int>の別名として定義
using pll = pair<long long, long long>; // pllをpair<long long, long long>の別名として定義
using vi = vector<int>; // viをvector<int>の別名として定義
using vll = vector<long long>; // vllをvector<long long>の別名として定義
using vpii = vector<pair<int, int>>; // vpiiをvector<pair<int, int>>の別名として定義
using vpll = vector<pair<long long, long long>>; // vpllをvector<pair<long long, long long>>の別名として定義
using namespace atcoder;
----------------------------------
&&//かつ
||//または
abs()//絶対値
----------------------------------
int main()
{
    int N, Q;
    float f;
    double d;
    long long ll;
    char c;
    string s;
    cin >> N >> Q;
    vector<int> A(N),L(Q),R(Q),V(Q),E(Q)={0};
    for (int i = 0; i < N; i++)
    {
        cin >> A[i];
    } 
    for (int j = 0; j <= Q; j++){
     cin >> L[j] >> R[j] >> V[j];
     E[j]=A[j]+V[j];
  
    }
    int ans =0;
for(int k=0;k<Q;k++){
       ans += abs(E[k]-E[k+1]);
}
    cout << ans << endl;
    return 0;
}
----------------------------------
cout << (flg ? "Yes" : "No") << endl;
// flgがtrueなら"Yes"、falseなら"No"を出力
----------------------------------
print("%d\n", ans);
    return 0;

    int num = -99;
    // 実体の出力
    cout << num << endl;  // -99
    // アドレスの出力
    cout << &num << endl;  // 0x00F4

    A.push_back(1);
    A.push_back(2);

A.at(0);//配列の要素を取得
A[0];//配列の要素を取得
A.size();//配列のサイズを取得
A.clear();//配列の要素を削除
A.insert(A.begin(), 0);//配列の先頭に要素を追加
A.erase(A.begin());//配列の先頭の要素を削除
A.begin();//配列の先頭のイテレータを取得
A.end();//配列の末尾のイテレータを取得
min element(A.begin(), A.end());//配列の最小値を取得
max element(A.begin(), A.end());//配列の最大値を取得
A.push_back(1);//配列の末尾に要素を追加
pair<int, int> p;//ペア
pair<int, int> p(1, 2);//ペアの初期化
P.first;//ペアの最初の要素を取得
P.second;//ペアの2番目の要素を取得
accumulate(A.begin(), A.end(), 0);//配列の合計値を取得
tuple<int, int, int> t;//タプル
tuple<int, int, int> t(1, 2, 3);//タプルの初期化
matrix<int> m(3, vector<int>(3));//行列の初期化
vector<vector<int>> m(3, vector<int>(3));//行列の初期化


stack<>a;//スタック(先入れ後出し)
queue<>b;//キュー（先入れ先出し）
deque<>c;//デッキュー（両端キュー）
priority_queue<>d;//優先度付きキュー（大きい順）
vector<int> e;//ベクター
map<int, int> f;//マップ(std::mapとはC++標準ライブラリに用意された平衡二分木であり要素の要素数に対する対数オーダーでの高速な検索能力と内部で要素がソート状態で保持される)
set<int> g;//セット
unordered_map<int, int> h;//ハッシュマップ
unordered_set<int> i;//ハッシュセット
multiset<int> j;//マルチセット

s.top();//スタックの先頭要素
s.pop();//スタックの先頭要素を削除
s.push();//スタックに要素を追加
insert();//要素を追加
s.find();//要素を検索
s.erase();//要素を削除
s.empty();//スタックが空かどうか
s.size();//スタックのサイズ
s.clear();//スタックを空にする
sl=s;//sを同じstack型のslに代入する
s.resize();//スタックのサイズを変更する
Q.front();//キューの先頭要素
Q.back();//キューの末尾要素

mint a(1);//整数をmodで割った余りを保持するクラス

a%bはa-[a/b]*b

++a;//+1してから参照
a++;//参照してから+1

----------------------------------
#include <iostream>
#include <fstream> // ファイル操作に必要

int main() {
    // ファイル名を指定
    std::string fileName = "example.txt";

    // ファイルを生成して書き込みモードで開く
    std::ofstream outFile(fileName);

    // ファイルが正常に開けたか確認
    if (outFile.is_open()) {
        outFile << "こんにちは、C++の世界！" << std::endl; // ファイルに書き込む
        outFile << "このファイルは自動生成されました。" << std::endl;
        outFile.close(); // ファイルを閉じる
        std::cout << "ファイルが正常に生成されました: " << fileName << std::endl;
    } else {
        std::cerr << "ファイルを開けませんでした。" << std::endl;
    }

    return 0;
}
----------------------------------












