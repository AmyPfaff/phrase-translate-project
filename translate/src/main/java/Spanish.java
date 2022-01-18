import java.util.HashMap;
import java.util.Map;

public class Spanish extends Phrase {

    public Spanish() {
        Map<String, String> spanishPhrases = new HashMap<>();
        spanishPhrases.put("1", "Hola!");
        spanishPhrases.put("2", "Adiós!");
        spanishPhrases.put("3", "Por favor");
        spanishPhrases.put("4", "Gracias!");
        spanishPhrases.put("5", "Lo siento.");
        spanishPhrases.put("6", "Te quiero!");
        this.setPhrases(spanishPhrases);
    }

}
