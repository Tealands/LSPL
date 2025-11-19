%VSCode左下の歯車アイコン→コマンドパレット→「>jupyter Notebook」

\documentclass{article}%ドキュメントのクラスを指定するコマンド
\usepackage[utf8]{inputenc}%ドキュメントの文字エンコーディングを指定するためのパッケージ
\usepackage{graphicx}%画像を挿入するためのパッケージ
\usepackage{amsmath}%高度な数式を記述するためのパッケージ
\usepackage{amssymb}%数学記号を拡張するためのパッケージ
\usepackage{amsthm}%定理、補題、証明などの環境を定義するためのパッケージ
\usepackage{listings}%ソースコードを美しく表示するためのパッケージ
\usepackage{color}%テキストや図の色を変更するためのパッケージ
\usepackage{fancyvrb}%コードやテキストを「そのままの形式」で表示するためのパッケージ
\usepackage{fancyhdr}%ヘッダーやフッターをカスタマイズするためのパッケージ
\usepackage{lipsum}%ダミーテキスト（Lorem Ipsum）を生成するためのパッケージ
\usepackage{hyperref}%ドキュメント内にハイパーリンクを追加するためのパッケージ
\usepackage{geometry}%ページの余白やレイアウトをカスタマイズするためのパッケージ
\geometry{top=20mm,bottom=20mm,left=20mm,right=20mm}
\usepackage{titlesec}%セクション（章、節、項など）のタイトルのスタイルをカスタマイズするためのパッケージ

\maketitle
\title{Explain about MaximumQuiz}  %ここでは日本語は表示されなくなる
\author{Tealand and Co-pilot}
\date{2024/4/17}
\begin{document}

------------------------------------------
$A$%$で挟むと数式モードになる
$B$%数式モードの中では日本語は表示されない
a=\sum_{i=1}^{n} i^2%シグマの公式
b=\prod_{i=1}^{n} i^2%プロダクトの公式
\begin{equation}
\begin{equation}
c=\sqrt{a^2+b^2}%ピタゴラスの定理
\end{equation}
\begin{equation}
a=\int_{0}^{1} x^2 dx%積分の公式
\end{equation}

\section{Explain about the program}



\section{How to use the program}


\section{Future additions}
・\newline%で改行する
・\newline
・\newline
・

\end{document}

--------------------------------------------------------------------
\documentclass[uplatex]{jsarticle}

\title{\LaTeX テスト}
\author{名前}

\begin{document}
    \maketitle

    この文章は \LaTeX で書かれています。

\end{document}
--------------------------------------------------------------------