package chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryBasic {

	public static void main(String[] args) {
		try (var in = new FileInputStream("C:\\Users\\敦\\Desktop\\Pleiades\\data\\nothing.t")) {
			var data = -1;
			while ((data = in.read()) != -1) {
				System.out.printf("%02X ", data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
