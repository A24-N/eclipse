#問題文
#N個の商品があり、商品i(i=1,2,⋯,N)の価格はAi円です。
#異なる3つの商品を選び、合計価格をピッタリ1000円にする方法は存在しますか。
#
#制約
#3≤N≤1001≤Ai≤1000入力はすべて整数

N = gets.chomp
A = gets.split().map(&:to_i)
flag = "No"

#A.each do |i|
#  A.each do |j|
#    next if i == j
#    A.each do |k|
#      next if i == k || j == k
#      if i + j + k == 1000
#        flag = "Yes"
#      end
#    end
#  end
#end
 
A.combination(3).each do |i, j, k|
  flag = "Yes" if i + j + k == 1000
end
 
puts flag