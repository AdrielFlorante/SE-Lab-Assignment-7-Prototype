public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf0 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf0.open();

        System.out.println();

        Document text = registry.createText("meeting_notes.txt", "UTF-8", 250);
        text.open();

        System.out.println();

        Document spreadsheet = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        spreadsheet.open();

        System.out.println();
    }
}