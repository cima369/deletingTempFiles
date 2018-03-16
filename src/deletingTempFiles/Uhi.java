package deletingTempFiles;

import java.awt.AWTException;
import java.awt.Desktop;

import java.io.File;
import java.io.IOException;

public class Uhi {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Desktop d = Desktop.getDesktop();
		File dir = null;
		String user = System.getProperty("user.name");
		StringBuffer userD = new StringBuffer("C:\\");
		userD.append("Users\\");
		userD.append(user);
		userD.append("\\");
		userD.append("AppData\\Local\\Temp");
		String directory = userD.toString();
		dir = new File(directory);
		d.open(dir);
		
		Thread.sleep(333);
	
		File[] dltd = dir.listFiles();
		if (dltd != null) {
			for (File f : dltd) {
				f.delete();
			}
		}

	}

}
