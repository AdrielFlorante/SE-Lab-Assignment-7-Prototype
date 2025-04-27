public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf0 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        Document text = registry.createText("meeting_notes.txt", "UTF-8", 250);
        Document spreadsheet = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);

        System.out.println();

        pdf0.open();

        System.out.println();

        text.open();

        System.out.println();

        spreadsheet.open();

        System.out.println();

        Document pdf1 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        pdf1.open();
    }
}