import java.util.HashMap;
import java.util.Map;

public class Irish extends Phrase {

    public Irish() {
        Map<String, String> irishPhrases = new HashMap<>();
        irishPhrases.put("1", "Dia dhuit!");
        irishPhrases.put("2", "Slán!");
        irishPhrases.put("3", "Le do thoil");
        irishPhrases.put("4", "Go raibh maith agat!");
        irishPhrases.put("5", "Tá aiféala orm.");
        irishPhrases.put("6", "Is breá liom tú!");
        super.setPhrases(irishPhrases);
    }

}
