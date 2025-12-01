#include <stdio.h>

int main() {
    int N;
    char word[256];

    printf("繰り返し回数を入力して下さい。\n");
    scanf("%d", &N);

    printf("繰り返す単語を入力して下さい。\n");
    scanf("%255s", word);

    for (int i = 0; i < N; i++) {
        printf("%s\n", word);
    }

    return 0;
}