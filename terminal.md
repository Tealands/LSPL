ターミナル上では#でコメントアウト（その行の無効化）ができる

ls-l name* # nameで始まるファイルを表示
mv name name2 # nameをname2に変更
cp name name2 # nameをname2にコピー
more name # nameの中身を表示
cat name # nameの中身を表示
grep name # nameを含むものを表示
grep -v name # nameを含まないものを表示
ps -ef o user # プロセスを表示
ps -ef | grep name # nameを含むプロセスを表示
top # プロセスをリアルタイムで表示
htop # topの拡張版(インストールが必要)
jobs # バックグラウンドで動いているプロセスを表示  
touch filename.programing_language # programing_languageでファイルを作成
rmdir directryname # directrynameを削除
rm filename # filenameを削除
more A # Aの中身を表示する
diff A B # AとBの異なる部分だけ抜き出す
echo A # Aと表示する
&& # 前のコマンドが成功したら次のコマンドを実行する ex) echo "成功" && echo "次のコマンド"
echo "失敗" || echo "次のコマンド" # 前のコマンドが失敗したら次のコマンドを実行する
cat filename # filenameの中身を表示する
cat filename1 filename2 # filename1とfilename2の中身を表示する
cat filename1 filename2 > filename3 # filename1とfilename2の中身をfilename3に書き込む
echo "A" > filename # filenameにAと書き込む
echo "A" >> filename # filenameの末尾にAと書き込む
echo "A" > filename # filenameにAと書き込む
echo "A" >> filename # filenameの末尾にAと書き込む
---------------------------------------------------------------------------------
time # コマンドの実行時間を表示
date # 現在の日付を表示
date +%Y-%m-%d # 現在の日付を表示(%a: 曜日の名前を月、火、水などに省略して表示します。
%A: 曜日の完全な名前 (月曜日、火曜日、水曜日など) を出力します。
%u: 曜日の番号を出力します。月曜日=1、火曜日=2、水曜日=3 などです。
%w: 曜日の番号を出力します。日曜日=0、月曜日=1、火曜日=2 などです。
%d: 必要に応じて先頭にゼロ (01、02 … 09) を付けて日付を出力します。
%e: 必要に応じて先頭にスペース (「 1」、「 2」 ... 「 9」) を付けて、日付を印刷します。アポストロフィは印刷されないことに注意してください。)
cal # カレンダーを標準出力する
cal -3 # 3ヶ月分のカレンダーを表示(1,3以外は使えない)
tree # ディレクトリ構造をツリー形式で表示
code . # VScodeを起動する
zip zipname originfile # zipファイルを作成
pdflatex TeX_test.tex # texファイルをpdfに変換
pdflatex TeX_test.tex && echo "PDF生成成功" # texファイルをpdfに変換した後に"PDF生成成功"と表示
evince /home/tea-ingland/TeX_test.pdf # pdfファイルを表示
history # コマンドの履歴を348個表示
history ~ # コマンドの履歴を~個表示
history -c # コマンドの履歴を削除
Ctrl + C # プログラムを強制終了
Ctrl + D # プログラムを終了
---------------------------------------------------------------------------------
code . # VScodeを起動する
emacs filename # ファイルをemacsで開く
sudo apt install ~ # ~をインストール
sudo apt install -y python3-pip # python3-pipをインストール
npm create vite@latest firsrt-react-app # reactのプロジェクトを作成
npm run dev # React起動する
npm run build #  
npm install # package.jsonをもとにnode_modulesをインストールする
pip install package_name # package_nameをインストール
pip install --upgrade package_name # package_nameをアップグレード

snippetsの削除は上のアドレスを見てVSCodeの中にあるsnippetsをrmで削除する
---------------------------------------------------------------------------------
  Github
git init # リポジトリを作成
git clone URL # リポジトリをクローン
git checkout -b branchname # ブランチを作成
git checkout branchname # ブランチを変更
# issueを作成、割り当て
# ブランチを作り、出されたコードをVScodeに入力する
# ブランチ内で作業する
git add . # すべての変更をステージング
git add filename # filenameの変更をステージング
git commit -m "message" # 変更をコミット
git push repositry branchname # 変更をプッシュ
git pull repositry branchname # 変更をプル
git pullrequest # プルリクエストを作成
git fetch origin # リモートリポジトリの情報を取得
git pull origin main # リモートリポジトリのmainをプル
git switch -c branchname # ブランチを作成
git pull origin branchname # リモートリポジトリのbranchnameをプル
git branch # ブランチを確認
git merge branchname # ブランチをマージ
git branch -d branchname # ブランチを削除
git checkout branchname # ブランチを変更
git status # ステータスを確認
git log # コミットの履歴を確認
git remote -v # リモートリポジトリを確認
git remote add origin URL # リモートリポジトリを追加
git remote remove origin # リモートリポジトリを削除
git push origin branchname # 今いるブランチのリモートリポジトリにプッシュ
git pull origin branchname # 今いるブランチのリモートリポジトリからプル
git branch -a # ブランチを確認
git branch -d branchname # ブランチを削除
git branch -m branchname newbranchname # ブランチ名を変更
git checkout -b branchname # ブランチを作成
git checkout branchname # ブランチを変更
git pull origin main # リモートリポジトリのmainをプル
git pull origin branchname # リモートリポジトリのbranchnameをプル
git checkout -b branchname origin/branchname # リモートリポジトリのブランチをローカルに作成
git fetch origin # リモートリポジトリの情報を取得(これで誰かのブランチにある内容を検証できる)
git merge origin/branchname # リモートリポジトリのブランチをマージ
git push origin branchname # リモートリポジトリにプッシュ
git pull origin branchname # リモートリポジトリからプル
git push origin :branchname # リモートリポジトリのブランチを削除
git push origin --delete branchname # リモートリポジトリのブランチを削除
git branch -r # リモートリポジトリのブランチを確認
---------------------------------------------------------------------------------
# コンフリクトが起きたときの対処
git checkout --theirs .
git add .
git commit -m "任意の文"
---------------------------------------------------------------------------------
 C++
g++ filename1.cpp -o filename2 # filename1.cppの実行ファイルをつくり、filename2と名付ける
g++ filename1.cpp # filename1.cppの実行ファイルをつくり、a.outと名付ける
./filename2 # filename2を実行する
./a.out # a.outを実行する
./a.out < in.txt # a.outを実行してin.txtの中身を入力する
./a.out < out.txt # a.outを実行してout.txtに出力内容をコピーする（元の内容は消える）
---------------------------------------------------------------------------------
 C言語
gcc filename.c # filename.cの実行ファイルを作る
gcc -std=c99 filename.c -lm # filename.cの実行ファイルを作る(1999年までに実装されたものが使える)
gcc -o test1 test1.c mleak.c # test1.cとmleak.cをコンパイルしてtest1を作る(mallocがある時に使う)
./a.out # a.outを実行する
./a.out < in.txt # a.outを実行してin.txtの中身を入力する
./a.out < out.txt # a.outを実行してout.txtに出力内容をコピーする（元の内容は消える）
---------------------------------------------------------------------------------
 C#
dotnet new console -o MyApp #プロジェクト作成
cd MyApp #MyAppフォルダーに入る
dotnet run #実行
---------------------------------------------------------------------------------
 HTML
npm start
npm init -y # package.jsonを作成
python3 -m http.server 8000 # python3でサーバーを立ち上げる
python3 -m http.server 8000 --bind
npm install -g live-server # live-serverをインストール
live-server # live-serverを起動
---------------------------------------------------------------------------------
 Javascript
node filename.js # filename.jsを実行する
node # node.js(ターミナルのjavascript)を起動する
node -v # node.jsのバージョンを確認
curl filename.js | node # filename.jsを実行する
---------------------------------------------------------------------------------
 TypeScript
tsc filename.ts # filename.tsをコンパイルしてfilename.jsを作成する
node filename.js # filename.jsを実行する
---------------------------------------------------------------------------------
 Go
go run filename.go # filename.goを実行する
go build filename.go # filename.goの実行ファイルを作成する
./filename # filenameを実行する
---------------------------------------------------------------------------------
 Python
python3 filename.py # filename.pyを実行する
python3 # python3を起動する
python3 -V # python3のバージョンを確認
---------------------------------------------------------------------------------
 Java
javac filename.java# filename.javaをコンパイルしてfilename.class(コード内で宣言)を作成する
javac -encoding UTF-8 filename.java # filename.javaをUTF-8でコンパイル(より広い文字に対応)
java filename # filenameを実行する(.classは不要)
javec -version # Javaのバージョンを確認
code FirstExample.java # FirstExample.javaをVScodeで開く(どうせVSCodeで開くからあまり意味ない)
---------------------------------------------------------------------------------
 Ruby

---------------------------------------------------------------------------------
 R
R # Rを起動する
quit() # Rを終了する
---------------------------------------------------------------------------------
LaTeX
pdflatex filename.tex # filename.texをpdfに変換する
pdflatex filename.tex && echo "PDF生成成功" # filename.texをpdfに変換した後に"PDF生成成功"と表示
bibtex filename # bibtexを実行する

---------------------------------------------------------------------------------
//
npm create vite@latest my-project
cd my-project

//これでtailwindcssのテンプレートをダウンロード
npm install tailwindcss @tailwindcss/vite
