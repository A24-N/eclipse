#問題文
#英大文字および英小文字からなる文字列 
#S が与えられます。
#ここで、 
#S のうちちょうど 
#1 文字だけが英大文字であり、それ以外は全て英小文字です。
#大文字が 
#S の先頭から何文字目に登場するか出力してください。
#ただし、
#S の先頭の文字を 
#1 文字目とします。
#
#制約
#S は英大文字および英小文字からなる長さ 
#2 以上 
#100 以下の文字列
#S に大文字はちょうど 
#1 つ含まれる。

s = gets.chomp

puts s.index(/[A-Z]/) + 1