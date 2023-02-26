#問題3
#単調な整数
#77777のように1種類の数字(0を除く)のみからなる整数を「単調な整数」と呼ぶことにします。
#9桁以下の「単調な整数」で2151で割り切れるものがただ1つあります。その整数を求めてください。

x = 2151

arr = Array.new

(1..9).each do |i|
  (1..9).each do |j|
  arr.push(i)
  arrj = arr.join
  if arrj.to_i % x == 0
    p arrj
  end
  end
  arr = Array.new
end

