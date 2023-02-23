#問題文
#2進法表記で表された整数Nが与えられます。
#Nを10進法に変換した値を出力するプログラムを作成してください。
#
#制約
#Nの長さは1文字以上8文字以下
#Nは0と1からなるNの先頭の桁は1である


N = gets.chomp.reverse
keta = N.to_s.length
result = 0
keta.times do |x|
  result += N.slice(x).to_i * (2 ** x)
end

puts result