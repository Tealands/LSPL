~~abc~~ 打消し線となる

<!-- HTMLと同じくこれでコメントアウトにできる -->

---

//  Markdownにサンプルコードを記載する場合のテンプレート例
'''markdown
ここに段落の内容を書いてください。
'''

'''html

<!-- ここにHTMLコードを書いてください -->

<html>
</html>

'''[](このように、ほかの言語を書くこともできます。)

```言語名
// ここにコードを書いてください
```

---

# セクションのタイトル(大)

## セクションのタイトル(小)

ここにセクションの内容を書いてください。

- リストの例1
- リストの例2

* これでもリストになる
* これでもリストになる

*リスト(親)
 *リスト(子)
 *リスト(子)
*リスト

> 引用の例
> ２行目の引用

* **UTF**　<!-- こんな風に合わせて使える -->

**A** 文字を太くする

--- 区切り

[ABC](https:~)文字をリンクにする

---
//数式

これはインライン数式です：$a^2 + b^2 = c^2$

指数: $x^2$, $x^{n}$, $e^{x}$<br>
下付き文字: $x_1$, $x_{i+1}$, $H_2O$<br>
平方根: $\sqrt{x}$, $\sqrt{a^2 + b^2}$<br>
n乗根: $\sqrt[3]{x}$, $\sqrt[n]{x}$<br>
基本の分数: $\frac{1}{2}$, $\frac{a}{b}$<br>
複雑な分数: $\frac{x^2 + 3x + 2}{x + 1}$<br>
連分数: $\frac{1}{1 + \frac{1}{2 + \frac{1}{3}}}$<br>
$\alpha$ (アルファ), $\beta$ (ベータ), $\gamma$ (ガンマ), $\delta$ (デルタ)
$\epsilon$ (イプシロン), $\zeta$ (ゼータ), $\eta$ (イータ), $\theta$ (シータ)
$\iota$ (イオタ), $\kappa$ (カッパ), $\lambda$ (ラムダ), $\mu$ (ミュー)
$\nu$ (ニュー), $\xi$ (クサイ), $\pi$ (パイ), $\rho$ (ロー)
$\sigma$ (シグマ), $\tau$ (タウ), $\upsilon$ (ウプシロン), $\phi$ (ファイ)
$\chi$ (カイ), $\psi$ (プサイ), $\omega$ (オメガ)<br>
基本の総和: $\sum_{i=1}^{n} i = \frac{n(n+1)}{2}$<br>
複雑な総和: $\sum_{i=1}^{n} i^2 = \frac{n(n+1)(2n+1)}{6}$<br>
無限総和: $\sum_{n=0}^{\infty} \frac{1}{2^n} = 2$<br>
---
//改行
- 後ろに空白２つ
- <br>
- 一行空白の行を入れる
---

// 音声ファイルの埋め込み例

<audio controls="" src="sample.mp3" controlslist="nodownload"></audio>
// 動画ファイルの埋め込み例
<video controls="" src="sample.mp4"></vodeo>
// 画像ファイルの埋め込み例
![代替テキスト](sample.png)
----------------------------------------------------------------
// 折りたたみの例
<details><summary>問題1の正解はこちら</summary>
(ここは一行開けること)
~ここに折りたたみの内容を書いてください。
</details>
----------------------------------------------------------------
//テキストボックスの埋め込み例

---

//リストボックスの埋め込み例

---

//補足説明
:::note info
インフォメーション
infoは省略可能です。
:::
//緑色の枠で内容を表示し、チェックマーク（セーフマークをつける）

:::note warn
警告
○○に注意してください。
:::
//黄色の枠で内容を表示し、エクスクラメーション（警告をつける）

:::note alert
より強い警告
○○しないでください。
:::
//赤の枠で内容を表示し、×（禁止マークをつける）

---
<!-- コードブロックとコピー用ボタン -->
<div style="position: relative;">
  <button onclick="copyCode(this)" style="
    position: absolute; 
    top: 5px; 
    right: 5px; 
    padding: 4px 8px; 
    font-size: 12px;
    cursor: pointer;
  ">Copy</button>

  <pre><code class="language-js">
// サンプルコード
function hello() {
    console.log("Hello, world!");
}
hello();
  </code></pre>
</div>

<!-- コピー処理用スクリプト -->
<script>
function copyCode(button) {
    try {
        const code = button.nextElementSibling.innerText;
        navigator.clipboard.writeText(code).then(() => {
            button.textContent = "Copied!";
            setTimeout(() => button.textContent = "Copy", 1500);
        });
    } catch (err) {
        alert("コピーに失敗しました: " + err);
    }
}
</script>
ポイント
<div> でコードとボタンをまとめる
→ ボタンの位置を position: absolute で右上に固定。
navigator.clipboard.writeText() を使ってコピー
→ モダンブラウザ対応。HTTPS 環境推奨。
Markdown 内で HTML が使える環境 でのみ動作
→ GitHub README では不可（セキュリティ制限のため）。
静的サイト（Hugo, Jekyll, Docusaurus など）や自作ブログなら可能。
✅ もし GitHub README や Qiita のように HTML/JS が制限される環境なら、
JavaScript は使えないので、静的サイトジェネレーターでビルド時にコピー機能を付与する方法が必要です。
（例：Highlight.js + Clipboard.js を組み込み）
---------------------------------------------------------------------------
//表の例
| 見出し1 | 見出し2 | 見出し3 |
| ------- | ------- | ------- |
| データ1 | データ2 | データ3 |
| データ4 | データ5 | データ6 |
| データ7 | データ8 | データ9 |
---------------------------------------------------------------------------
 

