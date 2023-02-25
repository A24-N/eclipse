#問題文
#N台のプリンターがあり、1からNまでの番号が付けられています。
#プリンターiはAi秒ごとにチラシを1枚印刷します。
#すなわち、スイッチを入れてからAi秒後、2Ai秒後、3Ai秒後･･･に印刷します。
#すべてのプリンターのスイッチを同時に入れたとき、K枚目のチラシが印刷されるのは何秒後でしょうか。
#
#制約
#1≤N≤100000
#1≤K≤10**9
#1≤Ai≤10**9
#答えは10**9を超えない
#入力はすべて整数

n, k = gets.split().map(&:to_i)
a = gets.split().map(&:to_i)

def check(a, k, x)
  sum = 0
  a.each do |i|
    sum += x / i
  end
  if sum >= k
    return true
  else
    return false
  end
end

l = 1
r = 10**9
while l < r
  mid = (l + r) / 2
  result = check(a, k, mid)
  if result == false
    l = mid + 1
  else
    r = mid
  end
end

puts l