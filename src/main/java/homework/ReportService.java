package homework;

public class ReportService {
    public Document document;
    public ReportType reportType;

    public ReportService(Document document, ReportType reportType) {
        this.document = document;
        this.reportType = reportType;
    }

    public void createReport() {
        switch (reportType) {
            case PDF: {
                PDFReport pdfReport = new PDFReport(document);
                pdfReport.PrintReport(document);
                break;
            }
            case JSON: {
                JSONReport jsonReport = new JSONReport(document);
                jsonReport.PrintReport(document);
                break;
            }
            case XML: {
                XMLReport xmlReport = new XMLReport(document);
                xmlReport.PrintReport(document);
                break;
            }
            default: throw new UnsupportedOperationException("Введены некорректные данные");
        }
    }
     public enum ReportType{
        PDF,
        JSON,
        XML}
}
