#問題文
#あるリゾートホテルには，1号室からN号室までのN個の部屋があります．
#i号室はAi人部屋です．
#このホテルではD日間にわたって工事が行われることになっており，d日目はLd号室からRd号室までの範囲を使うことができません．
#d=1,2,⋯Dについて，d日目に使える中で最も大きい部屋は何人部屋であるか，出力するプログラムを作成してください．
#
#制約
#3≤N≤100000
#1≤D≤100000
#1≤Ai≤100
#2≤Li≤Ri≤N−1
#入力はすべて整数

n = gets.to_i
a = gets.split().map(&:to_i)
a.unshift(0)
d = gets.to_i
p = Array.new(n+1, 0)
q = Array.new(n+1, 0)

p[1] = a[1]
1.upto(n) do |i|
  p[i] = [p[i-1], a[i]].max
end
    
q[n] = a[n]
(n-1).downto(1) do |i|
  q[i] = [q[i+1], a[i]].max
end

d.times do
  l, r = gets.split().map(&:to_i)
  puts [p[l - 1], q[r + 1]].max
end