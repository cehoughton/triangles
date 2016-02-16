import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) ->{
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangles", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      int sideOne = Integer.parseInt(request.queryParams("sideOneIn"));
      int sideTwo = Integer.parseInt(request.queryParams("sideTwoIn"));
      int sideThree = Integer.parseInt(request.queryParams("sideThreeIn"));

      Triangles myTriangles = new Triangles( sideOne, sideTwo, sideThree );
      model.put("myTriangles", myTriangles);

      model.put("template", "templates/triangles.vtl");
      return new ModelAndView( model, layout);
    }, new VelocityTemplateEngine());
  }
}
