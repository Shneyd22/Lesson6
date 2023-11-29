package homework;



public class PDFReport extends Report{

    public PDFReport(Document document) {
        super(document);
    }

    @Override
    void PrintReport(Document document) {
        System.out.printf("PDF" + document.getId() + document.getText());
    }
}
