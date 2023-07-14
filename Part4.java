import edu.duke.*;

public class Part4 {
    public void test () {
        URLResource url = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String word : url.words()) {
            String wordLower = word.toLowerCase();
            if (wordLower.indexOf("youtube.com") != -1) {
                int indexStart = word.lastIndexOf("\"", wordLower.indexOf("youtube.com"));
                int indexEnd = word.indexOf("\"", indexStart + 1);
                System.out.println(word.substring(indexStart + 1, indexEnd));
            }
        }
    }
}
