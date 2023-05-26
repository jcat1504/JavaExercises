import java.util.regex.Matcher;
import java.util.regex.Pattern;

//MATCHER CLASS

public class Example {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("nap time", Pattern.CASE_INSENSITIVE);

    Matcher matcher = pattern.matcher("Every morning starts with some nap time!");
    boolean findMatcher = matcher.find();
    System.out.print(findMatcher);
  }
}


public class Example {
  
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("gr[ae]y", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
    int count = 0;
    while(matcher.find())count++;
    System.out.println(count);
  }
}

//QUANTIFIERS

public class Example {

  public static void main(String[] args) {
    String[] strings = {"CCQQ", "QQCC", "CQQ", "QUACK", "CCQ", "CQC", "CQQQ", "CCCQQ"};
    Pattern pattern = Pattern.compile("C+Q{2}");
    Matcher matcher;
    for(String s: strings){
      matcher = pattern.matcher(s);
      System.out.println(matcher.matches());
    }
  }
}

//ALTERNATION
public class Example {
  
    public static void main(String[] args) {
      Pattern pattern = Pattern.compile("gray|grey", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
  
      int i = 0;
      while (matcher.find())i++;
      System.out.println(i);
    }
  }