public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();

        System.out.println();

        Document text = registry.createText("meeting_notes.txt", "UTF-8", 250);
        text.open();

        System.out.println();


    }
}