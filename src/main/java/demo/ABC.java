package demo;

import com.opencsv.bean.CsvBindByName;

public class ABC {

    @CsvBindByName(column = "A", required = true)
    private String a;

    @CsvBindByName(column = "B", required = true)
    private String b;

    @CsvBindByName(column = "C", required = true)
    private String c;

    @Override
    public String toString() {
        return "demo.ABC{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
