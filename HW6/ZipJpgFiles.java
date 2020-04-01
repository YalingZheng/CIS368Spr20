import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ZipJpgFiles {	
	private static byte[] readBytesFromFile(String filePath) {
        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;
        try {
            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];
            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bytesArray;
    }

	public static void main(String args[]) {
		int numfiles = 4;
		JpgFile[] jpgfiles = new JpgFile[numfiles];
		String[] JpgFileLocations = { "src\\images\\Picture1.jpg", "src\\images\\Picture2.jpg", 
				"src\\images\\Picture3.jpg", "src\\images\\Picture4.jpg" };
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("ZappedJpgFiles.dat");
		} catch (FileNotFoundException e) {
			// if the file does exist but for some reason is inaccessible,
			// forexample when an attempt is made to open a read-only file for writing.
			System.out.println("ZappedJpgFiles.data cannot be written. Error - " + e.getMessage());
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeInt(numfiles);
			for (int i = 0; i < numfiles; i++) {
				jpgfiles[i] = new JpgFile("Picture" + i + ".jpg", new File(JpgFileLocations[i]));
				oos.writeUTF(jpgfiles[i].getName());
				// convert the file to byte[]
				
				byte[] bFile = readBytesFromFile(JpgFileLocations[i]);
				oos.writeInt(bFile.length);
				oos.write(bFile);
			}
			oos.flush();
			oos.close();
			System.out.println("successfully written file to data ZappedJpgFiles.dat");

		} catch (IOException e) {
			System.out.println("IOException. Error - " + e.getMessage());
		}

	}
}
