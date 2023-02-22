#問題文
#N個の整数 A1,A2,⋯,ANの中に、整数 X が含まれるかどうかを判定するプログラムを作成してください。
#
#制約
#Nは1以上100以下の整数
#Xは1以上100以下の整数
#A1,A2,⋯,ANは1以上100以下の整数

i, j = gets.split.map(&:to_i)
array = gets.split.map(&:to_i)

puts array.include?(j) ? "Yes" : "No"