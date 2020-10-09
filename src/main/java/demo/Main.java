package demo;

public class Main {
    public static void main(String[] args) {
        String fileName = "/tmp/testData.csv";

/* Contents of the file:
A,B,C
1,2,3
11,12,13
21,22,23
*/
        new CsvGetter(fileName).get();
    }
}
