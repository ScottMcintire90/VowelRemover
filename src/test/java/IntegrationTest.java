import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Vowel Remover");
  }
  @Test
  public void resultsTest_HomePageFormValidation_ReturnsHyphentedSentence() {
    goTo("http://localhost:4567");
    fill("#userInput").with("I am a cat");
    submit(".btn");
    assertThat(pageSource()).contains("- -m - c-t");
  }
}
