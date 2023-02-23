#問題文
#赤・青・白の3枚のカードがあります。
#太郎君は、それぞれのカードに1以上N以下の整数を書かなければなりません。
#3枚のカードの合計をKにするような書き方は何通りありますか。
#
#制約
#Nは1以上3000以下の整数
#Kは3以上9000以下の整数

N,K = gets.split().map(&:to_i)
result = 0

#(1..N).each do |i|
#  (1..N).each do |j|
#    (1..N).each do |k|
#      if i + j + k == K
#        result += 1
#      end
#    end
#  end
#end

(1..N).each do |i|
  (1..N).each do |j|
    k = K - i - j   
    result += 1 if 0 < k && k <= N
  end
end

puts result
