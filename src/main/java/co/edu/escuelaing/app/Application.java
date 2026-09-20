package co.edu.escuelaing.app;

import static co.edu.escuelaing.httpserver.httpserver2.WebFramework.*;

public class Application {

    public static void main(String[] args) throws Exception {

        staticfiles("/webroot");

        get("/hello", (req, resp) -> {
            String name = req.getValue("name");
            if (name == null || name.isBlank()) {
                name = "world";
            }
            return "Hello " + name;
        });

        get("/pi", (req, resp) -> String.valueOf(Math.PI));

        // el puerto por argumento es solo para probar mientras el 8080 esta ocupado
        start(args.length > 0 ? Integer.parseInt(args[0]) : 8080);
    }
}
