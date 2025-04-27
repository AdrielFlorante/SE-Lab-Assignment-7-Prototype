public class TextDocument implements Document {
    private String filePath; // why is it an integer in the UML diagram
    private String encoding;
    private int wordCount;

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words:" + wordCount);
    }

    @Override
    public String getType() {
        return "Text";
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
