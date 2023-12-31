package src.day_15;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int max = 0;

        for (String sentence : sentences) {
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    count++;
                }
            }
            max = Math.max(max, count);
            count = 0;
        }
        return max + 1;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(new MaximumNumberOfWordsFoundInSentences().mostWordsFound(sentences));
    }
}
