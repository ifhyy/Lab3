public class Main {
    public static void main(String[] args) {
        //C3 = 1523%3 = 2
        //C17 = 1523%17 = 10
        // З кожного речення заданого тексту видалити підрядок найбільшої довжини, що починається та закінчується
        // заданими літерами
        String text = "З кожного речення заданого тексту видалити підрядок найбільшої довжини, що починається та закінчується заданими літерами." +
                "Степ, оповитий тишею, дихав пахощами росяних трав. " +
                "В усному мовленні між частинами складного речення на місці розділового знака робиться невеличка пауза.";
        String [] sentences = text.split("[.!?]\\s*");
        System.out.println(text);
        char start = 'q';
        char stop = 'w';
        int r = 0;
        int e = 0;
        for (int k = 0; k < sentences.length; k++) {
            for (int i = sentences[k].indexOf(sentences[k].charAt(0)); i < sentences[k].length(); i++) {
                if (sentences[k].toCharArray()[i] == start) {
                    r = i;
                    break;
                }
            }
            for (int j = sentences[k].length() - 1; j > 0; j--) {
                if (sentences[k].toCharArray()[j] == stop) {
                    e = j;
                    break;
                }
            }

            String first = sentences[k].substring(0, r);
            String second = sentences[k].substring(e + 1, sentences[k].length());
            System.out.println(first + second);
        }
    }
}
