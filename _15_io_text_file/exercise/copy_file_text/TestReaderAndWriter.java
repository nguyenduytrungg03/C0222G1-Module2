package _15_io_text_file.exercise.copy_file_text;


import java.util.List;

public class TestReaderAndWriter {
    public static void main(String[] args) {
        List<String> stringList = ReaderAndWriter.reader("_15_io_text_file\\exercise\\copy_file_text\\source.txt");
        for (String item: stringList ) {
            ReaderAndWriter.writer("_15_io_text_file/exercise/copy_file_text/target.txt",item);
        }
    }
}
