import java.util.*;
import java.util.Map;
import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class VowelRemover {
  public static void main(String[] args) {
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //
    //   String userInput = request.queryParams("number");
    //   NumbersToWords newNumbers = new NumbersToWords();
    //   String convertedNumber = newNumbers.integerConverter(userInput);
    //   model.put("convertedNumber", convertedNumber);
    //
    //   model.put("template", "templates/detector.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String sentence) {
    String newS = sentence.replaceAll("[AEIOUaeiou]", "-");
    return newS;
  }

}
