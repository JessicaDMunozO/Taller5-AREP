package co.edu.escuelaing.sparkdockerdemolive;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args) {
        port(getPort());
        staticFiles.location("/public");

        get("hello", (req, res) -> "Hello Docker!");
        get("sin/:val", (req, res) -> {
            Double sin = Math.sin(Math.toRadians(Double.valueOf(req.params(":val"))));
            return "The result is: " + sin;
        });
        get("cos/:val", (req, res) -> {
            Double cos = Math.cos(Math.toRadians(Double.valueOf(req.params(":val"))));
            return "The result is: " + cos;
        });
        get("palindrome/:word", (req, res) -> {
            String reverse = "";
            for (int i = req.params(":word").length() - 1; i >= 0; i--) {
                reverse += req.params(":word").charAt(i);
            }
            if (req.params(":word").equals(reverse)) {
                return "It's a palindrome";
            } else {
                return "Isn´t a palindrome";
            }
        });
        get("vector/:val1/:val2", (req, res) -> {
            Double square1 = Math.pow(Double.valueOf(req.params(":val1")), 2);
            Double square2 = Math.pow(Double.valueOf(req.params(":val2")), 2);
            Double sum = square1 + square2;
            Double magnitude = Math.sqrt(sum);
            return "The magnitud of the vector is: " + magnitude;
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}