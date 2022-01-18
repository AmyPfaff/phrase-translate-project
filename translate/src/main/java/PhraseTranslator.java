import java.util.Scanner;

public class PhraseTranslator {

    public static void main(String[] args) {

        // Thank you. I love you. Hello. Goodbye. Please. I'm sorry.
        // class for each language, attribute for each phrase?
        // Start with selector for language, then say choose a language in 1st chosen language, then
        // say choose a number (in chosen language, and next to numbers is phrases in 1st chosen language)
        // then print out the phrase in 2nd chosen language. (can they pick same as 1st language? can I stop them?)
        // Korean, English, Greek?, French, Spanish, German, Japanese, Irish?,

        Scanner scanner = new Scanner(System.in);
        Phrase phrase = new Phrase();

        String languageOptions = "[1] English | [2] Français | [3] Deutsch | [4] Ελληνικά | [5] Gaeilge | [6] Italiano | [7] 한국어 | [8] Polski | [9] Español";
        String divider = "***************************";

        System.out.println(languageOptions);
        String userLanguage = scanner.nextLine();
        System.out.println(divider);
        System.out.println();

        System.out.println(languageOptions + "\n" + phrase.getChooseALanguage().get(userLanguage));
        String translateLanguageInput = scanner.nextLine();
        System.out.println();
        printPhraseOptions(userLanguage);
        System.out.println(phrase.getChooseANumber().get(userLanguage));
        String translatePhraseInput = scanner.nextLine();
        System.out.println(divider);
        System.out.println();

        if (translateLanguageInput.equals("1")) {
            Phrase english = new English();
            System.out.println(english.getPhrases().get(translatePhraseInput));
        } else if (translateLanguageInput.equals("2")) {
            Phrase french = new French();
            System.out.println(french.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("3")) {
            Phrase german = new German();
            System.out.println(german.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("4")) {
            Phrase greek = new Greek();
            System.out.println(greek.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("5")) {
            Phrase irish = new Irish();
            System.out.println(irish.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("6")) {
            Phrase italian = new Italian();
            System.out.println(italian.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("7")) {
            Phrase korean = new Korean();
            System.out.println(korean.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("8")) {
            Phrase polish = new Polish();
            System.out.println(polish.getPhrases().get(translatePhraseInput));
        }else if (translateLanguageInput.equals("9")) {
            Phrase spanish = new Spanish();
            System.out.println(spanish.getPhrases().get(translatePhraseInput));
        }

    }

    public static void printPhraseOptions(String userLanguage) {
        if (userLanguage.equals("1")) {
            System.out.println("[1] Hello! | [2] Goodbye! | [3] Please | [4] Thank you! | [5] I'm sorry. | [6] I love you!");
        } else if (userLanguage.equals("2")) {
            System.out.println("[1] Bonjour! | [2] Au revoir! | [3] S'il vous plaît | [4] Merci! | [5] Je suis désolé. | [6] Je t'aime!");
        } else if (userLanguage.equals("3")) {
            System.out.println("[1] Hallo! | [2] Auf wiedersehen! | [3] Bitte | [4] Danke! | [5] Entschuldigung. | [6] Ich liebe dich!");
        } else if (userLanguage.equals("4")) {
            System.out.println("[1] Γεια σου. | [2] Αντίο. | [3] Παρακαλώ | [4] Σας ευχαριστώ. | [5] Σας ζητώ συγγνώμη. | [6] Σε αγαπώ.");
        } else if (userLanguage.equals("5")) {
            System.out.println("[1] Dia dhuit! | [2] Slán! | [3] Le do thoil | [4] Go raibh maith agat! | [5] Tá aiféala orm. | [6] Is breá liom tú!");
        } else if (userLanguage.equals("6")) {
            System.out.println("[1] Buongiorno! | [2] Arrivederci! | [3] Per favore | [4] Grazie! | [5] Mi scusi. | [6] Ti amo!");
        } else if (userLanguage.equals("7")) {
            System.out.println("[1] 안녕하세요! | [2] 안녕히 계세요! | [3] 주세요 | [4] 감사합니다! | [5] 죄송합니다. | [6] 사랑해!");
        } else if (userLanguage.equals("8")) {
            System.out.println("[1] Dzień dobry! | [2] Do widzenia! | [3] Proszę | [4] Dziękuję! | [5] Przepraszam. | [6] Kocham cię!");
        } else if (userLanguage.equals("9")) {
            System.out.println("[1] Hola! | [2] Adiós! | [3] Por favor | [4] Gracias! | [5] Lo siento. | [6] Te quiero!");
        }
    }

}
