n = gets.to_i
s = gets.chomp.chars
x = 0
y = 0
arr = [[0, 0]]
 
s.each do |i|
  if i == "R"
    x += 1
  elsif i == "L"
    x -= 1
  elsif i == "U"
    y += 1
  elsif i == "D"
    y -= 1
  end
  arr.push([x, y])
end
if (arr.count - arr.uniq.count) > 0
  puts "Yes"
else
  puts "No"
end