#問題1
#奇数の3乗の総和
#1から99までの奇数の3乗の和を求めてください。

sum = 0

(1).upto(99) do |i|
  if i % 2 > 0
    sum += i**3 
  end
end

puts sum