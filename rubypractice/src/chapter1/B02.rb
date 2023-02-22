#問題文
#A以上B以下の整数のうち、100の約数であるものは存在しますか。
#制約
#1≤A≤B≤100 入力はすべて整数

A,B = gets.split().map(&:to_i)
flag = "No"

for i in A..B do
  if 100 % i == 0
    flag = "Yes"
  end
end

puts flag

flag = "No"

(A..B).each do |i|
  if 100% i == 0
    flag = "Yes"
  end
end

puts flag