import java.util.HashMap;
import java.util.Map;

public class Greek extends Phrase {

    public Greek() {
        Map<String, String> greekPhrases = new HashMap<>();
        greekPhrases.put("1", "Γεια σου.");
        greekPhrases.put("2", "Αντίο.");
        greekPhrases.put("3", "Παρακαλώ");
        greekPhrases.put("4", "Σας ευχαριστώ.");
        greekPhrases.put("5", "Σας ζητώ συγγνώμη.");
        greekPhrases.put("6", "Σε αγαπώ.");
        this.setPhrases(greekPhrases);
    }

}
