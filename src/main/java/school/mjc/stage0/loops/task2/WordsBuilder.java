package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0, size = chars.length;
        while (i < size) {
            System.out.print(chars[i]);
            i++;
        }
    }
}
