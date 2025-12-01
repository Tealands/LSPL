puts "繰り返し回数を入力して下さい。"
n = gets.to_i

puts "繰り返す単語を入力して下さい。"
word = gets.chomp

n.times do
  puts word
end
