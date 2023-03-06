package chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryFinally {

	public static void main(String[] args) {
		FileInputStream in = null;
		
		try { 
			in = new FileInputStream("C:\\Users\\敦\\Desktop\\Pleiades\\data\\nothing.t");
			var data = -1;
			while ((data = in.read()) != -1) {
				System.out.printf("%02X ", data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//			ファイルの有無に関わらず、ファイルをクローズ
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
