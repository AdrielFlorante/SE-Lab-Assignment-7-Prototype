public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument("Prototype PDF");

    public Document createPdf (String name, String author, int pageCount) {
        System.out.println("Creating a PDF Document prototype."); // As from the instructions

        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setName(name);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        newPdf.setFileName(name); // Filename will be same as name?

        return newPdf;
    }
}
