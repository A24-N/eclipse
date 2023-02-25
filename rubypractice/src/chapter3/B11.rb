#問題文
#小さい順に並んでいるとは限らない、要素数Nの配列A=[A1,A2,⋯,AN]が与えられます。
#それについて、以下のQ個の質問に答えるプログラムを作成してください。
#i(1≤i≤Q)個目の質問：配列AにはXiより小さい要素が何個あるか？
#
#制約
#1≤N,Q≤100000
#1≤Ai≤10**9(1≤i≤N)
#1≤Xi≤10**9(1≤i≤Q)
#入力はすべて整数

n = gets.to_i
a = gets.split().map(&:to_i).sort

q = gets.to_i
q.times do
  x = gets.to_i
  puts a.bsearch_index{ |i| i >= x} || n
end