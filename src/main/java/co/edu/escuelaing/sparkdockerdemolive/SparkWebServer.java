package co.edu.escuelaing.sparkdockerdemolive;

import static spark.Spark.port;
import static spark.Spark.get;

public class SparkWebServer {

    public static void main(String... args){
          port(getPort());
          get("hello", (req,res) -> "Hello Docker!");
          get("sin/:val", (req, res) -> Math.sin(Math.toRadians(Double.valueOf(req.params(":val")))));
          get("cos/:val", (req, res) -> Math.cos(Math.toRadians(Double.valueOf(req.params(":val")))));
          get("palindrome/:word", (req, res) -> {
            String reverse = "";
            for (int i = req.params(":word").length() - 1; i >= 0; i--) {
                reverse += req.params(":word").charAt(i);
            }
            if (req.params(":word").equals(reverse)) {
                return "Is a palindrome";
            } else {
                return "Isn´t a palindrome";
            }
          });
          get("vector/:val1/:val2", (req, res) -> {
            Double square1 = Math.pow(Double.valueOf(req.params(":val1")), 2);
            Double square2 = Math.pow(Double.valueOf(req.params(":val2")), 2);
            Double sum = square1 + square2;
            Double magnitude = Math.sqrt(sum);
            return magnitude;
          });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}