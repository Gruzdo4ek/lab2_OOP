public class Sentence {
    private String sentence;
    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void sortWordsByLength() {
        String[] words = sentence.split(" ");
        boolean flag = false;
        String temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    flag = false;
                    temp = words[i + 1];
                    words[i + 1] = words[i];
                    words[i] = temp;
                }
            }
        }
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }
}


