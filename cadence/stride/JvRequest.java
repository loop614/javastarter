package cadence.stride;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JvRequest extends AbstractStride {
    private final static String THIS_FILE = "https://raw.githubusercontent.com/loop614/javastarter/main/cadence/stride/JvRequest.java";

    private final HttpClient client;

    public JvRequest() {
        this.client = HttpClient.newHttpClient();
    }

    @Override
    public void run() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(THIS_FILE))
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .GET()
                .build();

        this.client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
