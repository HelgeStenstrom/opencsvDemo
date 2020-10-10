# opencsvDemo
This code doesn't work with Java 14, unless the module-info.java file is removed. It works with Java 8.

I'm running with IntelliJ. 

There is one class, CsvGetter, with one method, get(), which uses opencsv to read a simple CSV file and store it to a List<ABC>. 
The class ABC is a simple data class with fields for the columns in the example data file.

The CsvGetter class is used in exactly the same way in the unit test and in the Main.main() method. 
Without a module-info.java file, the main() method and the unit test behave in the same way.
With a module-info file, the CsvGetter.get() method crashes when called from Main.main().

## Running this version: 
Set up the project structure so that both Project SDK and Project language level are Java 14.

Run the unit test in CsvGetterTest.testGetter() and watch it pass.

Run Main.main(), and watch it fail with 

/Library/Java/JavaVirtualMachines/jdk-14.0.2.jdk/Contents/Home/bin/java -javaagent:/Users/helge/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=54473:/Users/helge/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/202.7660.26/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -p /Users/helge/Documents/GitHub/opencsvDemo/target/classes:/Users/helge/.m2/repository/com/opencsv/opencsv/5.2/opencsv-5.2.jar:/Users/helge/.m2/repository/org/apache/commons/commons-lang3/3.10/commons-lang3-3.10.jar:/Users/helge/.m2/repository/org/apache/commons/commons-text/1.8/commons-text-1.8.jar:/Users/helge/.m2/repository/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar:/Users/helge/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/helge/.m2/repository/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar:/Users/helge/.m2/repository/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.jar -m opencsvDemo/demo.Main
Exception in thread "main" java.lang.NoClassDefFoundError: java/sql/Date
	at commons.beanutils@1.9.4/org.apache.commons.beanutils.ConvertUtilsBean.registerOther(ConvertUtilsBean.java:730)
	at commons.beanutils@1.9.4/org.apache.commons.beanutils.ConvertUtilsBean.deregister(ConvertUtilsBean.java:602)
	at commons.beanutils@1.9.4/org.apache.commons.beanutils.ConvertUtilsBean.<init>(ConvertUtilsBean.java:161)
	at opencsv@5.2/com.opencsv.bean.ConverterPrimitiveTypes.<init>(ConverterPrimitiveTypes.java:88)
	at opencsv@5.2/com.opencsv.bean.AbstractMappingStrategy.determineConverter(AbstractMappingStrategy.java:739)
	at opencsv@5.2/com.opencsv.bean.HeaderColumnNameMappingStrategy.loadAnnotatedFieldMap(HeaderColumnNameMappingStrategy.java:155)
	at opencsv@5.2/com.opencsv.bean.AbstractMappingStrategy.loadFieldMap(AbstractMappingStrategy.java:405)
	at opencsv@5.2/com.opencsv.bean.AbstractMappingStrategy.setType(AbstractMappingStrategy.java:343)
	at opencsv@5.2/com.opencsv.bean.util.OpencsvUtils.determineMappingStrategy(OpencsvUtils.java:77)
	at opencsv@5.2/com.opencsv.bean.CsvToBeanBuilder.build(CsvToBeanBuilder.java:210)
	at opencsvDemo/demo.CsvGetter.get(CsvGetter.java:23)
	at opencsvDemo/demo.Main.main(Main.java:13)
Caused by: java.lang.ClassNotFoundException: java.sql.Date
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:602)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	... 12 more

Process finished with exit code 1

