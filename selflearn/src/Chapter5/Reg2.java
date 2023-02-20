package Chapter5;
import java.util.regex.Pattern;
public class Reg2 {

	public static void main(String[] args) {
		System.out.println("regIgnore");
		regIgnore();
		System.out.println();
		System.out.println("regMulti");
		regMulti();
		System.out.println();
		System.out.println("regSingle");
		regSingle();
	}
	
	public static void regIgnore() {
		var str = "仕事用はwing@mail.comです。プライベート用はPRIVATE@example.comです。";
		var ptn = Pattern.compile("[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(\\.[a-z0-9-]+)*", Pattern.CASE_INSENSITIVE);
		var match = ptn.matcher(str);
		
		while (match.find()) {
			System.out.println(match.group());
		}
	}
	
	public static void regMulti() {
		var str = "10人のインディアン。\n1年生になったら。\nこんにちわ。";
//		[^]は文字列の先頭を表すが、MULTILINEを使うと改行後の行頭も含むようになる。
//		オプション値を複数指定する場合は[|]で連結する。
		var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
		var match = ptn.matcher(str);
		
		while (match.find()) {
			System.out.println(match.group());
		}
	}
	
	public static void regSingle() {
		var str = "はじめまして。\nよろしくお願いいたします。";
//		規定では[.]は改行を除くが、DOTALLを使うと改行文字も含むようになる。
		var ptn = Pattern.compile("^.+", Pattern.DOTALL);
		var match = ptn.matcher(str);
		
		while (match.find()) {
			System.out.println(match.group());
		}
	}
	
	
}
