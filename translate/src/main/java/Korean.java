import java.util.HashMap;
import java.util.Map;

public class Korean extends Phrase {

    public Korean() {
        Map<String, String> koreanPhrases = new HashMap<>();
        koreanPhrases.put("1", "안녕하세요!");
        koreanPhrases.put("2", "안녕히 계세요!");
        koreanPhrases.put("3", "주세요");
        koreanPhrases.put("4", "감사합니다!");
        koreanPhrases.put("5", "죄송합니다.");
        koreanPhrases.put("6", "사랑해!");
        this.setPhrases(koreanPhrases);
    }

}
