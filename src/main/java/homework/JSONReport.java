package homework;

public class JSONReport extends Report{
    public JSONReport(Document document) {
        super(document);
    }

    @Override
    void PrintReport(Document document) {
        System.out.println("JSON" + document.getId() + document.getText());
    }
}
