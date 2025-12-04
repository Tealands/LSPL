<!DOCTYPE HTML PUBRIC ~>
<html lang = "ja">
<head>
<meta charset="UTF-8"><,!--文字コードの指定-->  

--------------------------------------------------------------------------
<!--
<p>HTMLhはこれでコメントアウトする。</p>
-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> <!--<p>ここにタイトルを入れる</p>--></title>
<style><!-- CSSのスタイルをここに記述 -->
header {
    padding: 20px;
    text-align: center;
    background-color: #75d0e9;
}
body {
    background-color: rgb(255, 255, 255);
    color: rgb(2, 1, 1);
    font-family: Arial, sans-serif;
    margin: 18px;
    padding: 18px;
    text-align: center;
}
</style>
</head>
<body><body hgcolor = "" text = "">
<a href="../index4.html">戻る</a><!--リンク（文字は変えられる）-->
----------------------------------------------------------------
<h1>Web研究会</h1>
<p>Web研究会<span>プログラミングサークル</span>です。</p>
<h2>Webの分野</h2>
<ul>
  <li>フロントエンド</li>
  <li>バックエンド</li>
  <a href="A">B</a>/*リンクを貼る*/
  <a href="../">B</a>/*一つ上のディレクトリに飛ぶ*/
  ----------------------------------------------------------------
  <indexterm>
  漢字の語句
  <index-sort-as>かんじのごく</index-sort-as>
</indexterm>
----------------------------------------------------------------
<dev>
    // Enterキーで次の問題へ進む処理を追加
    document.getElementById('answerInput').addEventListener('keydown', function(event) {
        if (event.key === 'Enter') {
            checkAnswer();
            setTimeout(generateQuestion, 500); // 答え合わせ後0.5秒待って次の問題を生成
        }
    });
</dev>
</html>
<br>/*これで改行する*/
var style = "disc"; //リストのスタイルを指定する変数
----------------------------------------------------------------
<style>
/* CSSのスタイルをここに記述 */
    //JSON形式でデータを記述する  
    ul{
list-style-type:~(style);}
none
disc
circle
square
lower-roman
upper-roman
lower-alpha
upper-alpha
number
    /*リストのスタイルを指定*/
    margin: 0;
---------------------------------------------------------------------------------------------------
//ヘッダーのスタイル
  <div class="message" id="message"></div>//メッセージ表示用のdiv要素
  <div class="score" id="score">Score: 0</div>//スコア表示用のdiv要素
  <div class="question" id="question"></div>//問題表示用のdiv要素
  <input type="text" id="answerInput" placeholder="答えを入力してください" autofocus>//答え入力用のテキストボックス
  <button onclick="checkAnswer()">答え合わせ</button>//答え合わせボタン
  <button onclick="generateQuestion()">次の問題</button>//次の問題ボタン
------------------------------------------------------------------------
<link rel="icon" href="~" type="image/x-icon">//ファビコンのリンク~
&nbsp;&nbsp;//空白
-------------------------------------------------------------------------
absolute://固定される
relative://上にある要素から相対的な場所になる
hero//
fixed://画面や親要素に対して常に同じ位置に固定される（スクロールしても動かない）
flex-shrink-0//
sticky://スクロール位置に応じて通常配置から固定配置に切り替わる（親要素の範囲内で固定）
static://デフォルトの配置。特別な位置指定をしない通常のフロー配置
-----------------------------------------------------------------------------
rgb(43,210,34)//色の指定rgbは赤、緑、青の三原色()
-----------------------------------------------------------------------------
<details>
  <summary>詳細を表示</summary>
  <p>ここに詳細な情報を記載します。</p>
</details>
-----------------------------------------------------------------------------
<script scr = "https://maximum.vc/js/maximum.js"></script>//外部のjavascriptファイルを読み込む
or
<script>
const script = document.createElement('script');
・
・
・
</script>//ここに直接コードを書く(使えるのはjs,ts,jsx,tsx)
-----------------------------------------------------------------------------
  <script src="https://cdn.tailwindcss.com"></script>//tailwindcssを読み込む
-----------------------------------------------------------------------------
    <a href="https://maximum.vc/" target="_blank">
      <img src="keep_out/Maximum-logo.svg" alt="Maximumロゴ" class="absolute top-1 left-7 w-[2px] h-auto cursor-pointer">
    </a>//これでリンクを持つ画像にできる

<img src="https://maximum.vc/images/hero.png" alt="Maximumのロゴ" class="hero">//写真入れる
hero->
<iframe width="560" height="315" src="https://www.youtube.com/embed/gxbklMUNT70?autoplay=1" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
</iframe>//動画埋め込み（autoplayを追加すると自動で再生される）
<iframe width="560" height="315" src="https://www.youtube.com/embed/HPZOOhzql7w" style="display:none;" allowfullscreen>
</iframe>//style="display:noneによって画面は非表示で音声だけが再生される
-----------------------------------------------------------------------------
//表
<tr>~</tr>
<td>~</td>
<table>
 <caption>A 人口</caption>
 <tr>
  <td rowspan = "2">年代</td>
  <td colspan = "3">人口</td>
  <td>男性</td>
  <td>女性</td>
  <td>合計</td>
 </tr>
-----------------------------------------------------------------------------
 <progress>~</progress>
<meter>


-----------------------------------------------------------------------------








