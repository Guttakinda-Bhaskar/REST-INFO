import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaNetClientRestProject {

	public static void main(String[] args) {
		
		try {
			URL url=new URL("http://localhost:3030/api");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			//conn.addRequestProperty("Accept", "application/json");
			int responseCode = conn.getResponseCode();
			if(responseCode==200)
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String readLine = br.readLine();
				while(readLine!=null)
				{
					System.err.println(readLine);
				}
			}
			else
			{
				 throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
			}
			conn.disconnect();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
