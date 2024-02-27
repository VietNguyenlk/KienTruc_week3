package test;

import java.io.File;

public class test {
	public static void main(String[] args) {
		File projectDir = new File("C:\\Users\\Student\\eclipse-workspace\\tuan3\\src\\main\\java\\test");
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println(path);
		}).explore(projectDir);

	}
	void kk(String name) {
		
	}

}
