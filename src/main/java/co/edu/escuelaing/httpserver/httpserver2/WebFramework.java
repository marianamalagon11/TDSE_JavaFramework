package co.edu.escuelaing.httpserver.httpserver2;

import java.io.IOException;

public class WebFramework {

    public static void get(String route, WebService ws) {
        Router.register(route, ws);
    }

    // por ahora el puerto es fijo, en el punto de las env vars lo leo de PORT
    public static void start() throws IOException {
        start(8080);
    }

    public static void start(int port) throws IOException {
        HttpServer2.start(port);
    }

    public static void stop() {
        HttpServer2.stop();
    }
}
