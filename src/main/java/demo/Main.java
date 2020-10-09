package demo;

public class Main {
    public static void main(String[] args) {
        String fileName = "/tmp/testData.csv";
        new CsvGetter(fileName).get();
    }
}
