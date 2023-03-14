package examples;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GetSingleUserTest {

    @Test
    @DisplayName("GET /singleUser")
    public void successGetSingleUserAnotherExample() throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://reqres.in/api/unknown/2"))
                .GET().build();

        HttpResponse response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        assertEquals(200, response.statusCode(), "status code не соответствует");
    }
}