import org.junit.*;
import static org.junit.Assert.*;

public class VowelRemoverTest {

  @Test
  public void vowelRemover_oneVowelConvertsToHyphen_Hyphen() {
    VowelRemover testVowelRemover = new VowelRemover();
    String expected = "a";
    assertEquals(expected, testVowelRemover.vowelRemover("-"));
  }
}
