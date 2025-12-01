const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("繰り返し回数を入力して下さい。\n", (n) => {
  const N = parseInt(n, 10);

  rl.question("繰り返す単語を入力して下さい。\n", (word) => {
    for (let i = 0; i < N; i++) {
      console.log(word);
    }
    rl.close();
  });
});
