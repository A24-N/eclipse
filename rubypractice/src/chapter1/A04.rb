#問題文
#整数Nが10進法表記で与えられます。
#Nを2進法に変換した値を出力するプログラムを作成してください。
#
#制約
#Nは1以上1000以下の整数

N = gets.to_i
result =[]

9.downto(0){|n|
  result.push((N / (2 ** n)) % 2)
}
puts result.join

#N = gets.to_i
#
#9.downto(0){|n|
#  print((N / (2 ** n)) % 2)
#}