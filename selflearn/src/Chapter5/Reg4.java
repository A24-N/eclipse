package Chapter5;

import java.util.regex.Pattern;

public class Reg4 {

	public static void main(String[] args) {
		System.out.println("regNoRef");
		regNoRef();
		System.out.println();
		System.out.println("regReplace");
		regReplace();
		System.out.println();
		System.out.println("regReplaceNamed");
		regReplaceNamed();
		System.out.println();
		System.out.println("regSplit");
		regSplit();
		System.out.println();
	}
	
	public static void regNoRef() {
		var str = "仕事用はwing@mail.comです。プライベート用はPRIVATE@example.comです。";
		var ptn = Pattern.compile("([a-z0-9.!#$%&'*+/=?^_{|}~-]+)@([a-z0-9-]+(\\.[a-z0-9-]+)*)", Pattern.CASE_INSENSITIVE);
		var match = ptn.matcher(str);
		System.out.println("------");
		
		while (match.find()) {
			System.out.println(match.group());
			System.out.println(match.group(1));
			System.out.println(match.group(2));
			System.out.println(match.group(3));
			System.out.println("------");
		}
	}
	
	public static void regReplace() {
		var str = "Githubサイトはhttps://github.com/A24-N/game_bu/です。";
		System.out.println(str.replaceAll(
				"(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w ./?%&=-]*)?",
				"<a href=\"$0\">$0</a>"
				));
		var str1 ="名前は桜。桜と呼ばれます";
		System.out.println(str1.replace("桜", "サクラ"));
		System.out.println(str1.replaceFirst("桜", "サクラ"));
	}
	
	public static void regReplaceNamed() {
		var str = "仕事用はwork@mail.comです。";
		System.out.println(str.replaceAll("(?i)(?<localName>[a-z0-9.!#$%&'*+/=?^_{|}~-]+)"
				+ "@(?<domain>[a-z0-9-]+(?:\\.[a-z0-9-]+)*)", "${domain}の${localName}"));
	}
	
	public static void regSplit () {
		var str ="にわに3わうらにわに51わにわとりがいる";
		var re = Pattern.compile("\\d{1,}わ");
		var result = re.split(str);
		System.out.println(String.join(" ", result));
		
	}
}
