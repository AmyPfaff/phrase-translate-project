import java.util.HashMap;
import java.util.Map;

public class German extends Phrase {

    public German() {
        Map<String, String> germanPhrases = new HashMap<>();
        germanPhrases.put("1", "Hallo!");
        germanPhrases.put("2", "Auf wiedersehen!");
        germanPhrases.put("3", "Bitte");
        germanPhrases.put("4", "Danke!");
        germanPhrases.put("5", "Entschuldigung.");
        germanPhrases.put("6", "Ich liebe dich!");
        this.setPhrases(germanPhrases);
    }

}
