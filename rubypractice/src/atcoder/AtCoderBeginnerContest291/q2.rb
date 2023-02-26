n = gets.to_i
x = gets.split.map(&:to_i)

x = x.sort

n.times do
  x.shift
  x.pop
end

sum = x.sum
ave = sum / (3*n).to_f

puts ave