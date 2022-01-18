import java.util.HashMap;
import java.util.Map;

public class English extends Phrase {

    public English() {
        Map<String, String> englishPhrases = new HashMap<>();
        englishPhrases.put("1", "Hello!");
        englishPhrases.put("2", "Goodbye!");
        englishPhrases.put("3", "Please");
        englishPhrases.put("4", "Thank you!");
        englishPhrases.put("5", "I'm sorry.");
        englishPhrases.put("6", "I love you!");
        this.setPhrases(englishPhrases);
    }

}
