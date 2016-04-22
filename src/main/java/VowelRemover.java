import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelRemover {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String userInput = request.queryParams("userInput");
      VowelRemover newInput = new VowelRemover();
      String vowelsRemoved = newInput.vowelRemover(userInput);
      model.put("vowelsRemoved", vowelsRemoved);

      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String sentence) {
    String newS = sentence.replaceAll("[AEIOUaeiou]", "-");
    return newS;
  }

}
