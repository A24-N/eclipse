#問題文
#太郎君はくじをN回引き，i回目の結果はAiでした．
#Ai=1のときアタリ，Ai=0のときハズレを意味します．
#「L回目からR回目までの中では，アタリとハズレどちらが多いか？」という形式の質問が
#Q個与えられるので，それぞれの質問に答えるプログラムを作成してください．
#
#制約
#1≤N,Q≤10**5
#0≤Ai≤1
#1≤Li≤Ri≤N
#入力はすべて整数

N = gets.to_i
A = gets.split().map(&:to_i)
Q = gets.to_i
win = [0]
lose = [0]

A.each do |a|
  if a == 0
    lose.push(lose.last + 1)
    win.push(win.last + 0)
  else
    lose.push(lose.last + 0)
    win.push(win.last + 1)
  end
end

Q.times do
  l, r = gets.split().map(&:to_i)
  losenum = lose[r] - lose[l - 1]
  winnum = win[r] - win[l - 1]

  if winnum > losenum
    puts "win"
  elsif winnum < losenum
    puts "lose"
  else
    puts "draw"
  end
end

