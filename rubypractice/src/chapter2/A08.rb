#問題文
#H×Wのマス目があります．
#上からi行目，左からj列目にあるマス(i,j)には，整数Xi,jが書かれています．
#これについて，以下のQ個の質問に答えるプログラムを作成してください．
#
#i個目の質問：左上(Ai,Bi)右下(Ci,Di)の長方形領域に書かれた整数の総和は？
#制約
#1≤H,W≤1500
#1≤Q≤100000
#0≤Xi,j≤9
#1≤Ai≤Ci≤H
#1≤Bi≤Di≤W
#入力はすべて整数

h, w = gets.split().map(&:to_i)
x = h.times.map { gets.split.map(&:to_i) }
Q = gets.to_i
z = Array.new(h+1) { Array.new(w+1, 0) }
  
#横方向の累積和
(1..h).each do |i|
  (1..w).each do |j|
    z[i][j] = z[i][j-1] + x[i-1][j-1]
  end
end

#縦方向の累積和
(1..w).each do |j|
  (1..h).each do |i|
    z[i][j] = z[i-1][j] + z[i][j]
  end
end

Q.times do
  a, b, c, d = gets.split().map(&:to_i)
  puts z[c][d] + z[a-1][b-1] - z[a-1][d] - z[c][b-1]
end
