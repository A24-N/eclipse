#問題文
#小さい順に並べられている、要素数Nの配列A=[A1,A2,⋯,AN]があります。
#要素Xは配列Aの何番目に存在するかを出力してください。
#なお、この問題は単純な全探索（→1.2節）でも解けますが、ここでは二分探索法を使って実装してください。
#
#制約
#1≤N≤100000
#1≤A1<A2<⋯<AN≤10**9
#整数XはA1,A2,…,ANのいずれかである

n, x = gets.split().map(&:to_i)
a = gets.split().map(&:to_i)
l = 1
r = n

while (l <= r)
  m = (l+r)/2
  if x < a[m]
    r = m - 1
  elsif x == a[m]
    print m + 1
    break
  else
    l = m + 1
  end
end