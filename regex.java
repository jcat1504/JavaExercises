import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("nap time", Pattern.CASE_INSENSITIVE);

    Matcher matcher = pattern.matcher("Every morning starts with some nap time!");
    boolean findMatcher = matcher.find();
    System.out.print(findMatcher);
  }
}