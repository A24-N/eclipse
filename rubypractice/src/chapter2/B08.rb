#問題文
#二次元平面上にN個の点があります．i個目の点の座標は(Xi,Yi)です．
#「x座標がa以上c以下であり，y座標がb以上d以下であるような点は何個あるか？」
#という形式の質問がQ個与えられるので，それぞれの質問に答えるプログラムを実装してください．
#なお，入力される値はすべて整数です．
#
#制約
#1≤N,Q≤100000
#1≤Xi,Yi≤1500
#1≤ai≤ci≤1500
#1≤bi≤di≤1500
#入力はすべて整数

n = gets.to_i
list = Array.new(1502) { Array.new(1502, 0)}
  
n.times do
  x, y =gets.split().map(&:to_i)
  list[x][y] += 1
end

S = Array.new(1502) { Array.new(1502, 0)}

1502.times do |x|
  1502.times do |y|
    S[x][y] = S[x][y-1] + list[x][y]
  end
end

1502.times do |x|
  1502.times do |y|
    S[x][y] = S[x-1][y] + S[x][y]
  end
end

q = gets.to_i
q.times do
  a, b, c, d = gets.split().map(&:to_i)
  puts S[c][d] + S[a-1][b-1] - S[a-1][d] - S[c][b-1]
end



