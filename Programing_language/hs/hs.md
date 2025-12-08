-- Haskellの基本的な関数例

-- 1. 2つの数の和を計算する
add :: Int -> Int -> Int
add x y = x + y

-- 2. リストの長さを返す
length' :: [a] -> Int
length' [] = 0
length' (_:xs) = 1 + length' xs

-- 3. リストの各要素を2倍にする
doubleList :: [Int] -> [Int]
doubleList = map (*2)

-- 4. 与えられた数が偶数か判定する
isEven :: Int -> Bool
isEven x = x `mod` 2 == 0