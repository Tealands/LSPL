#include <stdio.h>// standard input
#include <math.h>//
#include <time.h>//時間関数を宣言する。
#include <string.h>//文字列操作関数を宣言する。
#include <stdlib.h>//標準ライブラリ関数を宣言する。
#include <ctype.h>//文字分類、文字変換に有用な関数を宣言する。
#include <cstdio>
#include<errno.h>//ライブラリ関数内エラーの報告用マクロを定義する。
#include<float.h>//浮動小数点型の大きさや特性を表すマクロを定義する。
#include<>
#include<>
---
//コメント
/*複数行コメント*/

~//否定
&&//論理積
^//排他的論理和
||//論理和

//上に書いたものほど優先される


FILE *fopen(const char *filename, const char *mode);//ファイルを開く関数
mode r//読み込みモード
mode w//書き込みモード
mode a//追記モード
mode r+//読み書きモード
mode w+//書き込み読み込みモード
mode a+//追記読み書きモード

FILE *fclose(FILE *stream);//ファイルを閉じる関数
FILE *freopen(const char *filename, const char *mode, FILE *stream);//ファイルを再オープンする関数
size_t fread(void *ptr, size_t size, size_t count, FILE *stream);//ファイルからデータを読み込む関数
size_t fwrite(const void *ptr, size_t size, size_t count, FILE *stream);//ファイルにデータを書き込む関数
int fseek(FILE *stream, long offset, int whence);//ファイルの位置を変更する関数
long ftell(FILE *stream);//ファイルの現在の位置を取得する関数
int fflush(FILE *stream);//ファイルのバッファをフラッシュする関数
int fprintf(FILE *stream, const char *format, ...);//フォーマット付きでファイルに出力する


void main(){
    printf("Hello, World!\n");
    
    printf("int n1: ");
    scanf("%d", &n1);//n1の前に&をつける必要あり

    int %d
    int a[] = {1, 2, 3, 4, 5};//配列の宣言
    char
    printf("%.3f\n", (float)a/b)//float型で小数点以下3桁まで表示する
    printf("%s\n", (char)a/b)//文字列型で表示する
    printf("%c\n", (char)a/b)//文字型で表示する
    punchar('a')//1文字の表示
    
    printf("%d\n", a/b);//整数型の割り算は整数型で返すので注意

    c[i][j] = a[i][j] + b[i][j];//二次元配列の足し算
    c[i][j] = a[i][j]*b[i][j];//二次元配列の掛け算
    printf("%d\n", a[i][j]);//二次元配列の表示
    printf("%d\n", a[0][0]);//二次元配列の表示


}
  
void A(){
    printf("Hello, World!\n");//値を返さず動作だけする関数はvoid型
    return 0;
}

int B(int a){
    return a*a;//値を返す関数はint型
}
//gcc -std=c99 ～　でコンパイルする

printf("%dと%d",&n,&m)
puts()
printf("")

switch(){
case:break;
case:break;
case:break;
fault:
break;
}

int *p;//ポインタ変数の宣言 
p=&a;//とすると
//pはaの住所、*pはaの値を指す
ただし*p+1はa+1ではなくaの次の住所を持つ値になる。配列を用意すれば次の値となる。
&pはさらにaのアドレスを格納しているアドレスを指す。
*/
x
printf("%d\n", *(iq + data[*ip]));//iqがポインタ型のとき、iq+2はiqの値に２を加えたものではなく、iqの指している要素の２つ先を指す


//*pxとxは同じものを指す
int x = 10;
int *px = &x;
printf("x = %d, *px = %d\n", x, *px);

struct _point data = {10, 20, "POINT-1"};
struct _point array[6];
struct _point *p = array;//
int i, j;
x->a//x が指す構造体のメンバ a にアクセスすることを意味する。xは構造体宣言をしたときの文字、aは構造体のアドレス。
for(i=0;i<6;i++){
   array[i].x = data.x + (i + 1);
   array[i].y = data.y + (i + 1) + 5;
   for(j=0;j<8;j++){ array[i].name[j] = data.name[j];
   array[i].name[6]=array[i].name[6]+i;
printf("%s\n", array[4].name);  
}}//

//構造体(struct student型)の宣言
struct student {//構造体名
    char  name[NAME_LEN];/* 名前 */
    int   height; /* 身長 */
    double weight; /* 体重 */
    };
//としておけば
int main(){
struct student A,B;// student型の構造体変数を宣言する
strcpy(A.name,"A");//要素のコピーを行う
A.height = 167;
A.weight = 56;
strcpy(height ->name,"B");//要素のコピーを行う
B=A //構造体変数AをBに代入する(配列はできないが構造体はできる)
}

strncat(){}

strcat(){}
int main(void) {//スタックの実装

fprintf()//
fscanf()//
fgets()//

x<<n//x*2^nを表すが、これによりxの中身が変わるわけではない。x>>nも同様である。

free()//メモリを解放する関数
malloc(sizeof(int)*n)//int型の配列をn個分確保する
(型 *) malloc( sizeof(型) * 必要な個数 );
calloc()//メモリを確保する関数
(型 *) calloc( sizeof(型) * 必要な個数 );
realloc()//メモリを再確保する関数
(型 *) realloc( ポインタ変数, sizeof(型) * 必要な個数 );
//メモリを確保する関数
(型 *) malloc( sizeof(型) * 必要な個数 );
(型 *) calloc( sizeof(型) * 必要な個数 );//無駄になるメモリが大きい
(型 *) realloc( ポインタ変数, sizeof(型) * 必要な個数 );
---
#include <stdio.h>

struct cell *cell1, *cell2;
    
cell1 = (struct cell*)malloc(sizeof(struct cell)); // cell1用のメモリを確保(*1は省略可)
cell2 = (struct cell*)malloc(sizeof(struct cell)*5); // cell2用のメモリを確保

struct cell {//自分の型と同じ型を指すことができる。
    int data;
    struct cell *nect;
    //次のセルへのポインタ
    //構造体の中に構造体を入れることができる
}
---
//時間計測用変数
clock_t start = clock();//計測開始
clock_t end = clock();//計測終了
double cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;//
---
//乱数の生成
unisigned int rand(void);//0からRAND_MAXまでの乱数を返す
srand(unsigned int seed);//乱数の種を設定する
//乱数の種を設定しないと毎回同じ乱数列が生成される
//時間を種にすることが多い
srand((unsigned int)time(NULL));//現在の時刻を種にする
//0からn-1までの乱数を生成するには
int r = rand() % n;//0からn-1までの乱数を生成
//aからbまでの乱数を生成するには
int r = a + rand() % (b - a + 1);//aからbまでの乱数を生成
//乱数の範囲を指定するには
int r = a + rand() / (RAND_MAX / (b - a + 1) + 1);//aからbまでの乱数を生成
---
//ビット演算
//nビットシフト
x << n;//xをnビット左シフト
x >> n;//xをnビット右シフト
//nビットマスク
unsigned int mask = (int)<<(sizeof(int)*8 - n);//上位nビットを1にするマスク
unsigned int mask = (int)>>(sizeof(int)*8 - n);//下位nビットを1にするマスク
//ビット反転
x = ~x;//xのビットを反転
//ビット論理積
x = x & mask;//xとmaskのビット論理積
//ビット論理和
x = x | mask;//xとmaskのビット論理和
//ビット排他的論理和
x = x ^ mask;//xとmaskのビット排他的論理和
---
#include <stdio.h>
#include <stdlib.h> // rand 関数を使用するために必要

/* 連結リストのセルを表すための構造体の宣言 */
struct cell {
    int data;
    struct cell *next;
};

void print_data_cell(struct cell *cell1);

int main()
{   
    /* 構造体セルのポインタを用意する */
    struct cell **cells;
    int num_cell, i;
    
    /* num_cell に標準入力からセル数を代入する */
    scanf("%d", &num_cell);

    /* cells に構造体セルのポインタ型の配列を num_cell の数だけ確保 */
    cells = (struct cell **)malloc(sizeof(struct cell*) * num_cell);
    for(i = 0; i < num_cell; i++)
        cells[i] = (struct cell *)malloc(sizeof(struct cell));
    
    /* 各セルの内容を設定し，cells[0]，cells[1], ... の順に連結する */
    for(i = 0; i < num_cell - 1; i++)
    {
        cells[i]->data = (i + 1) * 10;
        cells[i]->next = cells[i + 1];
    }
    cells[num_cell - 1]->data = num_cell * 10;
    cells[num_cell - 1]->next = NULL;

    print_data_cell(cells[0]);
    
    for(i = 0; i < num_cell; i++) free(cells[i]);
    free(cells);
    
    return 0;
}
---
void print_data_cell(struct cell *cell1)//連結リストの内容を表示する関数
{
    int i = 0;
while ( cell1 != NULL )
 {
 printf("%d\n",cell1->data);
 cell1 = cell1->next;
 i++;

 }
}
---
int main(void) {//スタックの実装
stack_t st;
st.top = -1;
push(&st, 21);
push(&st, 25);
push(&st, 23);
printf("(1): %d¥n", pop(&st));
push(&st, 6);
push(&st, 15);
pop(&st);
printf("(2): %d¥n", pop(&st));
pop(&st);
push(&st, 2);
push(&st, 5);
pop(&st);//popはデータを削除する
printf("(3): %d¥n", pop(&st));
return 0;
}
---