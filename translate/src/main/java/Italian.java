import java.util.HashMap;
import java.util.Map;

public class Italian extends Phrase {

    public Italian() {
        Map<String, String> italianPhrases = new HashMap<>();
        italianPhrases.put("1", "Buongiorno!");
        italianPhrases.put("2", "Arrivederci!");
        italianPhrases.put("3", "Per favore");
        italianPhrases.put("4", "Grazie!");
        italianPhrases.put("5", "Mi scusi.");
        italianPhrases.put("6", "Ti amo!");
        this.setPhrases(italianPhrases);
    }

}
