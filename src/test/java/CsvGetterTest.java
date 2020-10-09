import org.junit.jupiter.api.Test;

class CsvGetterTest {

    @Test
    void testGetter() {

        String fileName = "/tmp/testData.csv";
        new CsvGetter(fileName).get();
    }

}