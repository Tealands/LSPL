package main
import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	// Seed the random number generator
	rand.Seed(time.Now().UnixNano())

	// Generate a random number between 1 and 100
	randomNumber := rand.Intn(100) + 1

	// Print the random number
	fmt.Println("Random number:", randomNumber)
}



var message = "HELLO WORLD"

var number =100

var isTrue = true
var pi = 3.14


package main//mainパッケージに所属していることを示す。

import (//fmtパッケージをインポートしている。（異なるファイル名を入れるとインポートできる。）
	"fmt"
	_ "time"
	_ "os"//_をつけるとパッケージをインポートしているが、使っていないことを示す。
   )
   
func main() {
	fmt.Println("Hello, World!")
	//配列を追加する場合は、append関数を使う。
	numbers := [3]int{1, 2, 3}
fmt.Println(numbers) // 要素すべてを表示
fmt.Println(numbers[0]) // [ｎ]番目の要素を表示

// スライス
foods := []string{"apple", "banana", "orange"}

// 要素の追加
foods = append(foods, "grape")

fmt.Println(foods) // [apple banana orange grape]
	prices := map[string]int{
		"apple":  100,
		"banana": 200,
		"orange": 150,
	}
	
	// bananaの値を取得
	fmt.Println(prices["banana"]) // 200
}
//goでは"go run (ファイル名)"で実行できる。

//要素数を指定せずに配列を宣言するとスライスになります。

func getValues() (int, int) {
	return 1, 2
   }//このように２つの値を返すことができる。
   
   a, b := getValues()
   fmt.Println(a, b) // 1 2