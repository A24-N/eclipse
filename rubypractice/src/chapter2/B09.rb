#問題文
#二次元平面上にN枚の紙があります．それぞれの紙は，各辺がx軸またはy軸に平行であるような長方形となっています．
#また，i枚目の紙の左下座標は(Ai,Bi)であり，右上座標は(Ci,Di)です．
#1枚以上の紙が置かれている部分の面積を求めてください．なお，入力される値はすべて整数です．
#
#制約
#1≤N≤100000
#0≤Ai<Ci≤1500
#0≤Bi<Di≤1500
#入力はすべて整数

n = gets.to_i
x = Array.new(1502) {Array.new(1502, 0)}

n.times do
  a, b, c, d = gets.split().map(&:to_i)
  
  x[a][b] += 1
  x[a][d] -= 1
  x[c][b] -= 1
  x[c][d] += 1
end

1502.times do |i|
  1502.times do |j|
    x[i][j] = x[i-1][j] + x[i][j]
  end
end

1502.times do |i|
  1502.times do |j|
    x[i][j] = x[i][j-1] + x[i][j]
  end
end

area = 0
1502.times do |i|
  1502.times do |j|
    if x[i][j] >= 1
      area += 1
    end
  end
end
print area