#問題文
#ALGO王国はH×Wのマス目で表されます．最初は，どのマスにも雪が積もっていませんが，これからN日間にわたって雪が降り続けます．
#上からi行目，左からj列目のマスを(i,j)とするとき，t日目には「マス(At,Bt)を左上とし，
#マス(Ct,Dt)を右下とする長方形領域」の積雪が1cmだけ増加することが予想されています．
#最終的な各マスの積雪を出力するプログラムを作成してください．
#
#制約
#1≤H,W≤1500
#1≤N≤100000
#1≤Ai≤Ci≤H
#1≤Bi≤Di≤W
#入力はすべて整数

h, w, n = gets.split().map(&:to_i)
x = Array.new(h+2) { Array.new(w+2, 0) }
z = Array.new(h+2) { Array.new(w+2, 0) }

n.times do
  a, b, c, d = gets.split().map(&:to_i)
  
  x[a][b] += 1
  x[a][d+1] -= 1
  x[c+1][b] -= 1
  x[c+1][d+1] += 1
end

(h+1).times do |i|
  (w+1).times do |j|
    z[i][j] = z[i-1][j] + x[i][j]
  end
end

(h+1).times do |i|
  (w+1).times do |j|
    z[i][j] = z[i][j-1] + z[i][j]
    end
end

1.upto(h) do |i|
  1.upto(w) do |j|
    print(z[i][j],(" "))
  end
  puts ""
end