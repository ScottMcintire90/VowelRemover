import org.junit.*;
import static org.junit.Assert.*;

public class VowelRemoverTest {

  @Test
  public void vowelRemover_oneVowelConvertsToHyphen_Hyphen() {
    VowelRemover testVowelRemover = new VowelRemover();
    String expected = "-";
    assertEquals(expected, testVowelRemover.vowelRemover("a"));
  }
  @Test
  public void vowelRemover_oneWordReplacesVowelsWithHyphens_WordWithoutVowels() {
    VowelRemover testVowelRemover = new VowelRemover();
    String expected = "h-ll-";
    assertEquals(expected, testVowelRemover.vowelRemover("hello"));
  }
}
