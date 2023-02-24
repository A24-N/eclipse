#問題文
#遊園地「ALGO-RESORT」ではN日間にわたるイベントが開催され、i日目(1≤i≤N)にはAi人が来場しました。
#以下の合計Q個の質問に答えるプログラムを作成してください。
#1個目の質問：L1日目からR1日目までの合計来場者数は？
#2個目の質問：L2日目からR2日目までの合計来場者数は？
#:
#Q個目の質問：LQ日目からRQ日目までの合計来場者数は？
#制約
#1≤N,Q≤1051≤A
#i≤100001≤L
#i≤Ri≤N
#入力はすべて整数

N, Q = gets.split().map(&:to_i)
A = gets.split().map(&:to_i)

ary = [0]
  
A.each do |a|
  ary.push(ary.last + a)
end 

Q.times do
  l, r = gets.split().map(&:to_i)
  puts ary[r] - ary[l - 1]
end