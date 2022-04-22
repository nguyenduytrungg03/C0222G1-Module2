package _16_io_binary_serialization.exercise.manage_product;

import java.io.*;

public class ReaderAndWriteBinary {
    public static Object readFileBinary(String path) throws IOException {
        File file = new File(path);
        FileInputStream is = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            obj = ois.readObject();
            return obj;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            is.close();
        }
        return null;
    }

    public static void writeFileBinary(String path, Object obj) {
        File file = new File(path);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
