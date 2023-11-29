package homework;

public class XMLReport extends Report{
    public XMLReport(Document document) {
        super(document);
    }

    @Override
    void PrintReport(Document document) {
        System.out.printf("XML" + document.getId() + document.getText());
    }
}
