#include <iostream>
#include <string>
using namespace std;

int main() {
    int N;
    string word;

    cout << "繰り返し回数を入力して下さい。" << endl;
    cin >> N;

    cout << "繰り返す単語を入力して下さい。" << endl;
    cin >> word;

    for (int i = 0; i < N; i++) {
        cout << word << endl;
    }

    return 0;
}
