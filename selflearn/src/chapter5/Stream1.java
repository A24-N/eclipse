package chapter5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Stream1 {

	public static void main(String[] args) {
		streamWrite();
		streamReader();
		binaryReadWrite();
	}
	
	public static void streamWrite() {
		try (var writer = Files.newBufferedWriter(
				Paths.get("C:\\Users\\敦\\Desktop\\Pleiades\\data\\data.log"), StandardOpenOption.APPEND)) {
			writer.write("取得TIME:" + LocalDateTime.now().toString());
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void streamReader() {
		try (var reader = Files.newBufferedReader(
				Paths.get("C:\\Users\\敦\\Desktop\\Pleiades\\data\\sample.txt"), StandardCharsets.UTF_8)) {
			var line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void binaryReadWrite() {
		try (
			var in = new BufferedInputStream(
					new FileInputStream("C:\\Users\\敦\\Desktop\\Pleiades\\data\\bell.png"));
			var out = new BufferedOutputStream(
					new FileOutputStream("C:\\Users\\敦\\Desktop\\Pleiades\\data\\output.png"))) {
			
					var data = -1;
					while ((data = in.read()) != -1) {
						out.write((byte) data);
				} 
			} catch (IOException e) {
				e.printStackTrace();
		}
	}	
}
