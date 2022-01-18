import java.util.HashMap;
import java.util.Map;

public class Phrase {


    private Map<String, String> phrases = new HashMap<>();
    private Map<String, String> chooseALanguage = new HashMap<>();
    private Map<String, String> chooseANumber = new HashMap<>();

    public Phrase() {
        chooseALanguage.put("1", "Choose a language (1-9): ");
        chooseALanguage.put("2", "Choisissez une langue (1-9): ");
        chooseALanguage.put("3", "Wähle eine sprache (1-9): ");
        chooseALanguage.put("4", "Επιλέξτε μια γλώσσα (1-9): ");
        chooseALanguage.put("5", "Roghnaigh teanga (1-9):");
        chooseALanguage.put("6", "Scegli una lingua (1-9): ");
        chooseALanguage.put("7", "언어를 선택 (1-9): ");
        chooseALanguage.put("8", "Wybierz język (1-9):");
        chooseALanguage.put("9", "Escoge un idioma (1-9): ");

        chooseANumber.put("1", "Choose a number (1-6): ");
        chooseANumber.put("2", "Choisissez un numéro (1-6): ");
        chooseANumber.put("3", "Wähle eine nummer (1-6): ");
        chooseANumber.put("4", "Επιλέξτε έναν αριθμό (1-6): ");
        chooseANumber.put("5", "Roghnaigh uimhir (1-6): ");
        chooseANumber.put("6", "Scegli un numero (1-6): ");
        chooseANumber.put("7", "번호를 선택 (1-6): ");
        chooseANumber.put("8", "Wybierz numer (1-6): ");
        chooseANumber.put("9", "Escoge un número (1-6): ");
    }

    // but like do I also want a method for getting language choice? or will it work fine like this? must find out.
    public Map<String, String> getChooseALanguage() {
        return chooseALanguage;
    }

    // same as above.
    public Map<String, String> getChooseANumber() {
        return chooseANumber;
    }

    public Map<String, String> getPhrases() {
        return phrases;
    }

    public void setPhrases(Map<String, String> phrases) {
        this.phrases = phrases;
    }

    public void makePhrasesMap() {

    }


    // do I need to do a map, or just the series of attributes? I really want a map. for the numbered
    // correlation. but I could do a list too. and just put them in it in order? that's true. food for thought.

}
