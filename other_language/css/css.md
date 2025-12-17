/*コメントアウト*/

body {
    font-family: Arial, sans-serif;
    margin: 18px;
    padding: 18px;
    text-align: center;
    background-image: url("keep out/Elizabeth_Tower,_June_2022.jpg"); /* パス修正 */
    background-size: cover;
    background-position: center;
}
header {
    padding: 10px;
    text-align: center;
}
h1 {
    font-size: 5em;
    color: white;
    padding: 5px;
}
p {
    font-size: 2em;
    color: white;
    padding: 3px;
}
a {
    font-size: 1em;
    color: white;
    padding: 3px;
}
.tagtag {
    color: white;
    font-size: 2em;
}
.tagtag img {
    width: 100px;
    height: auto;
}


{
    "title": "サンプル小説",
    "content": "ある日、{{A}} は {{B}} に出会った。",
    "names": {
      "A": "山田",
      "B": "佐藤"
    }
  }


  Tailwind CSS

    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <button class="px-4 py-2 bg-blue-500 text-white rounded">
  Click me
</button>
<div class="flex justify-between items-center">
<!-- Flex container content -->
</div>


bg-blue-500//背景を青色に
bg-red-500//背景を赤色に
hover:bg-blue-700//ホバー時に青色に
text-white//テキストを白色に
font-bold//太字
py-2//上下のパディングを2
px4//左右のパディングを4
rounded//角を丸くする
/* Tailwind CSS */

---------------------------------
div {
  position: static;//特に指定がない場合のデフォルト値。通常の文書の流れに従って配置されます。

}

div {
  position: relative;

  top: 10px; /* 元の位置から10px下に移動 */
  left: 20px; /* 元の位置から20px右に移動 */
}
div {
  position: fixed;
  top: 0; /* ビューポートの上部に固定 */
  left: 0; /* ビューポートの左端に固定 */
}

div {
  position: absolute;
  top: 50px;
  left: 100px;
}

div {
  position: sticky;
  top: 0; /* スクロール時に上部に固定 */
}

--------------------------------------------------------------------
/* 折りたたみの見た目をカスタマイズ */
details {
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 10px;
  width: 300px;
  background-color: #f9f9f9;
}

/* summaryのスタイル */
summary {
  font-weight: bold;
  cursor: pointer;
  list-style: none;
}

/* 折りたたみ時のhover効果 */
summary:hover {
  color: #007BFF;
}

/* 折りたたみが開いた時のスタイル */
details[open] {
  background-color: #e6f7ff;
  border-color: #007BFF;
}
--------------------------------------------------------------------

scale
translate
transform


--------------------------------------------------------------------





