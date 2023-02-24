#問題文
#あるコンビニは時刻0に開店し、時刻Tに閉店します。
#このコンビニにはN人の従業員が働いており、i番目(1≤i≤N)の従業員は時刻Liに出勤し、時刻Riに退勤します。
#t=0,1,2,…,T−1それぞれについて、時刻t+0.5にコンビニにいる従業員の数を出力するプログラムを作成してください。
#
#制約
#1≤T≤500000
#1≤N≤500000
#0≤Li<Ri≤T(1≤i≤N)
#入力はすべて整数

T = gets.to_i
N = gets.to_i
people_num = Array.new(T+1, 0)

N.times do |n|
  l, r = gets.split().map(&:to_i)
  people_num[l] += 1
  people_num[r] -= 1
end

worker = 0
0.upto(T-1) do |t|
  worker += people_num[t]
  puts worker
end