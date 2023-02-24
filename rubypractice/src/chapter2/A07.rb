#問題文
#ある会社ではD日間にわたってイベントが開催され，N人が出席します．
#参加者iはLi日目からRi日目まで出席する予定です．各日の出席者数を出力するプログラムを作成してください．
#
#制約
#1≤D,N≤10**5
#1≤Li≤Ri≤D
#入力はすべて整数

D = gets.to_i
N = gets.to_i
arr = Array.new(D+2, 0)
print arr


N.times do
  l, r = gets.split().map(&:to_i)
  arr[l] += 1
  arr[r + 1] -= 1
end

joinnum = 0
1.upto(D) do |d|
  joinnum += arr[d]
puts joinnum
end
