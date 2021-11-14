import java.io.*;
import java.net.InetSocketAddress;
import java.util.stream.Collectors;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


class Server {
  public static void main(String[] args) throws IOException {
    int port = 9000;
    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

    System.out.println("server started at " + port);
    server.createContext("/", new MyHandler());
    server.setExecutor(null);
    server.start();
  }

  static class MyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
      String result = new BufferedReader(new InputStreamReader(t.getRequestBody()))
              .lines().parallel().collect(Collectors.joining("\n"));

      String response = "This is the response for : " + result;
      t.sendResponseHeaders(200, response.length());
      OutputStream os = t.getResponseBody();
      os.write(response.getBytes());
      os.close();
    }
  }
}
