import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelRemover {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      VowelRemover newInput = new VowelRemover();
      String userInput = request.queryParams("userInput");
      String vowelsRemoved = newInput.vowelRemover(userInput);

      model.put("user-input", userInput);
      model.put("vowels-removed", vowelsRemoved);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String sentence) {
    String newS = sentence.replaceAll("[AEIOUaeiou]", "-");
    return newS;
  }
}
