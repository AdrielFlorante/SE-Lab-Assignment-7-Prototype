public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument("Prototype PDF");
    private TextDocument textPrototype = new TextDocument();

    public Document createPdf (String name, String author, int pageCount) {
        System.out.println("Creating a PDF Document prototype."); // As from the instructions

        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setName(name);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        newPdf.setFileName(name); // Filename will be same as name?

        return newPdf;
    }

    public Document createText (String path, String encoding, int wordCount) {
        System.out.println("Creating a Text Document prototype.");

        TextDocument newText = textPrototype.clone();
        newText.setFilePath(path);
        newText.setEncoding(encoding);
        newText.setWordCount(wordCount);

        return newText;
    }
}
