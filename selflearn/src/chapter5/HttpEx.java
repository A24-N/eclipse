package chapter5;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		httpBasic();

	}
	
	public static void httpBasic () throws IOException, InterruptedException {
		//HTTPクライアントを作成
		var client = HttpClient.newHttpClient();
		//リクエスト準備
		var req = HttpRequest.newBuilder()
				.uri(URI.create("http://35.74.71.74/"))
				.build();
		//レスポンス取得
		var res = client.send(req, HttpResponse.BodyHandlers.ofString());
		//取得したコンテンツを出力
		System.out.println(res.body());
	}

}
