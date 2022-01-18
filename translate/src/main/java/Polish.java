import java.util.HashMap;
import java.util.Map;

public class Polish extends Phrase {

    public Polish() {
        Map<String, String> polishPhrases = new HashMap<>();
        polishPhrases.put("1", "Dzień dobry!");
        polishPhrases.put("2", "Do widzenia!");
        polishPhrases.put("3", "Proszę");
        polishPhrases.put("4", "Dziękuję!");
        polishPhrases.put("5", "Przepraszam.");
        polishPhrases.put("6", "Kocham cię!");
        this.setPhrases(polishPhrases);
    }

}
