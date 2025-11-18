-- コメントアウト
, 文末


IMPORT sqlite3;



CREATE TABLE （テーブル名）(
TEXT STRING NOT NULL,//データ名、型、列制約
YEAR INTEGER NOT NULL,
     REAL NOT NULL,
     BLOB NOT NULL,
)

INSERT INTO （テーブル名）(カラム名1, カラム名2, カラム名3) VALUES (値1, 値2, 値3);//*はすべての要素を母集合とすることを表す
SELECT * FROM （テーブル名） WHERE カラム名1 = 値1;
SELECT * FROM （テーブル名） WHERE カラム名1 = 値1 AND カラム名2 = 値2
//SELECTの指定の仕方
BETWEEN A and B//A~Bの範囲を選択（AとBも含む）
like %A//末尾がAの行を選択
like A%//戦闘がAの行を選択
lile A_C//この形（_は任意）を選択する
IS A//Aと完全一致する行を選択
IN ('A','B')//AかBのいずれかの行を選択（3つ以上でもOK）

ORDER BY ASD//昇順にソート
ORDER BY DESC//降順にソート


UPDATE （テーブル名） SET カラム名1 = 値1, カラム名2 = 値2 WHERE カラム名3 = 値3;
DELETE FROM （テーブル名） WHERE カラム名1 = 値1;
SELECT * FROM （テーブル名） WHERE created_at >= '2023-01-01' AND created_at < '2024-01-01';


'改行しても
同じもの
として
扱われる'

"これは改行するわけにはいかない"
