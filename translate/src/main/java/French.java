import java.util.HashMap;
import java.util.Map;

public class French extends Phrase {

    public French() {
        Map<String, String> frenchPhrases = new HashMap<>();
        frenchPhrases.put("1", "Bonjour!");
        frenchPhrases.put("2", "Au revoir!");
        frenchPhrases.put("3", "S'il vous plaît");
        frenchPhrases.put("4", "Merci!");
        frenchPhrases.put("5", "Je suis désolé.");
        frenchPhrases.put("6", "Je t'aime!");
        this.setPhrases(frenchPhrases);
    }

}
