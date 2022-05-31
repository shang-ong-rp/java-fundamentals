package LU99_HTTPClient;

//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPrequestDemo {

    public static void main(String[] args) {

    	try {

            URL url = new URL("https://postman-echo.com/get");//your url i.e fetch data from .api.openweathermap.org/data/2.5/weather?q=singapore&&APPID=398774ddfad0c2714f555a34fa7c434b
            
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }

//        private static final HttpClient httpClient = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_2)
//                .connectTimeout(Duration.ofSeconds(10))
//                .build();
//
//        public static void main(String[] args) throws IOException, InterruptedException {
//
//            // json formatted data
//            String json = new StringBuilder()
//                    .append("{")
//                    .append("\"name\":\"mkyong\",")
//                    .append("\"notes\":\"hello\"")
//                    .append("}").toString();
//
//            // add json header
//            HttpRequest request = HttpRequest.newBuilder()
//                    .POST(HttpRequest.BodyPublishers.ofString(json))
//                    .uri(URI.create("https://httpbin.org/post"))
//                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
//                    .header("Content-Type", "application/json")
//                    .build();
//
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//            // print status code
//            System.out.println(response.statusCode());
//
//            // print response body
//            System.out.println(response.body());

    }

}


//		HttpRequest request = HttpRequest.newBuilder()
//				  .uri(new URI("https://postman-echo.com/get"))
//				  .timeout(Duration.of(10, SECONDS))
//				  .GET()
//				  .build();
//		HttpRequest request = HttpRequest.newBuilder()
//				  .uri(new URI("https://postman-echo.com/post"))
//				  .headers("Content-Type", "text/plain;charset=UTF-8")
//				  .POST(HttpRequest.BodyPublishers.ofString("Sample request body"))
//				  .build();
