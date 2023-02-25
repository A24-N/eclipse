#問題文
#正の整数Nが与えられます。x3+x=Nを満たす正の実数xを出力してください。
#ただし、相対誤差または絶対誤差が0.001以下であれば正解とします。
#
#制約
#1≤N≤100000
#Nは整数

def f(x)
  x**3 + x
end

n = gets.to_f

l = 0.000
r = 100.000

while l < r
  mid = (l+r) / 2
  result =f(mid)
  if result > n
    r = mid
  elsif (result - n).between?(-0.001, 0.001)
    l = r
    break
  else
    l = mid
  end
end

print l