package solution;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        com.sun.net.httpserver.HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new solution.HttpHandlers());
        server.setExecutor(null);
        server.start();
    }

    private static com.sun.net.httpserver.HttpServer create(InetSocketAddress inetSocketAddress, int i) {
        return null;
    }
}