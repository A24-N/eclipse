package chapter7;

import java.util.Map;
import java.util.Optional;

public class BookMap {
//	「ISBNコード：書名」の形式で書籍情報を管理
	private Map<String, String> data;
	
//	書籍mapで書籍情報を初期化
	public BookMap(Map<String, String> map) {
		this.data = map;
	}
	
//	ISMBコード（引数isbn）をキーに書名を取得
	public String getTitleByIsbn(String isbn) {
		return this.data.get(isbn);
	}
		
//	ISMBコード（引数isbn）をキーに書名を取得。オプショナルクラスを利用
	public Optional <String> getTitleByIsbn2(String isbn) {
		return Optional.ofNullable(this.data.get(isbn));
	}

}
