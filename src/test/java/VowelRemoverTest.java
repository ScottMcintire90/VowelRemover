import org.junit.*;
import static org.junit.Assert.*;

public class VowelRemoverTest {

  @Test
  public void vowelRemover_behaviorWeAreTesting_expectedResult() {
    MainClassName testMainClassName = new MainClassName();
    String expected = "" ;
    assertEquals(expected, testMainClassName.methodName(""));
  }
}
