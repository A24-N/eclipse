package chapter5;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileEx {

	public static void main(String[] args) throws IOException {
		System.out.println("fileProcess");
		fileProcess();
		System.out.println();
		System.out.println("folderProcess");
		folderProcess();
	}
	
	public static void fileProcess() throws IOException {
		var fs = FileSystems.getDefault();
		var path1 = fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\sample.txt");
		
		//ファイルが存在するか
		System.out.println(Files.exists(path1));
		//ファイルは読み取り可能か
		System.out.println(Files.isReadable(path1));
		//ファイルは書き込み可能か
		System.out.println(Files.isWritable(path1));
		//ファイルは実行可能か
		System.out.println(Files.isExecutable(path1));
		//ファイルのサイズを取得
		System.out.println(Files.size(path1));
		//ファイルをコピー
		var path2 = Files.copy(path1, fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\copy.txt"),
				StandardCopyOption.REPLACE_EXISTING);
		//ファイルを移動
		Files.move(path2, fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\sub\\copy.txt"),
				StandardCopyOption.REPLACE_EXISTING);
		//ファイル名を変更
		var path3 = Files.move(path1, fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\sub\\rename.txt"),
				StandardCopyOption.REPLACE_EXISTING);
		//ファイルを削除
		Files.delete(path3);
		//ファイルが存在する場合のみ削除
		Files.deleteIfExists(path3);
	}
	
	public static void folderProcess() throws IOException {
		var fs = FileSystems.getDefault();
		var dir1 = fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\selflearn");
		var dir2 = fs.getPath("C:\\windows");
		
		//フォルダーの作成
		Files.createDirectories(dir1);
		//フォルダーが存在するか
		System.out.println(Files.exists(dir1));
		//フォルダーか
		System.out.println(Files.isDirectory(dir1));
		
		try (var s = Files.list(dir2)) {
			s.filter(v -> v.getFileName().toString().endsWith(".log")).forEach(System.out::println);
		}
		//フォルダーをコピー
		var dir3 = Files.copy(dir1,  fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\selflearn\\test"),
				StandardCopyOption.REPLACE_EXISTING);
		//フォルダーを移動
		Files.move(dir3, fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\selflearn\\sub"),
				StandardCopyOption.REPLACE_EXISTING);
		//フォルダーの削除
		Files.delete(fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\selflearn\\sub"));
		//フォルダーが存在する場合のみ削除
		Files.deleteIfExists(fs.getPath("C:\\Users\\敦\\Desktop\\Pleiades\\data\\selflearn\\sub"));
		
	}

}
