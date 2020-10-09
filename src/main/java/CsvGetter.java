import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvGetter {
    String fileName;

    public CsvGetter(String fileName) {
        this.fileName = fileName;
    }

    public void get() {
        try {
            FileReader reader = new FileReader(fileName);

            CsvToBeanBuilder<ABC> beanBuilder = new CsvToBeanBuilder<ABC>(reader).withType(ABC.class);

            CsvToBean<ABC> bean = beanBuilder.build();
            List<ABC> parse = bean.parse();



            System.out.println("Getting " + fileName + parse);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
