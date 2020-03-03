import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class sampleReadFile {
	
	public static void main(String[] args) {
		// read from a URL and 
		String userEnteredURL = 
				"https://github.com/YalingZheng/CIS368Spr20/blob/master/babynamesranking2017.txt";
		// Create URL from url .
		try {
				URL url = new URL(userEnteredURL);
				BufferedReader in = new BufferedReader(
					    new InputStreamReader(url.openStream()));

			    String inputLine;
			    while ((inputLine = in.readLine()) != null)
			        System.out.println(inputLine);
		}
		catch (MalformedURLException e) {
			
		}
		catch (IOException e) {
			
		}
	}
	
}
