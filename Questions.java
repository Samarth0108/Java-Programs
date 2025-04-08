import java.io.*;

public class Questions{

    public static void main(String[] args) throws Exception {

        // fileClassExample();
        // readUsingFileInputStream();
        // writeUsingFileOutputStream();
        // readUsingFileReader();
        // writeUsingFileWriter();
        // readUsingObjectInputStream();
        // writeUsingObjectOutputStream();
        //listSubFiles();
    }

    static void fileClassExample(){
        File file = new File("example.txt");
        System.out.println("File name: " + file.getName());
    }

    static void readUsingFileInputStream() throws Exception {
        FileInputStream fis = new FileInputStream("example.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }

    static void writeUsingFileOutputStream() throws Exception {
        FileOutputStream fos = new FileOutputStream("example.txt");
        String data = "Hello FileOutputStream";
        fos.write(data.getBytes());
        fos.close();
    }

    static void readUsingFileReader() throws Exception {
        FileReader fr = new FileReader("example.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }

    static void writeUsingFileWriter() throws Exception {
        FileWriter fw = new FileWriter("example.txt");
        fw.write("Hello FileWriter");
        fw.close();
    }

    static void readUsingObjectInputStream() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
        String str = (String) ois.readObject();
        System.out.println(str);
        ois.close();
    }

    static void writeUsingObjectOutputStream() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
        oos.writeObject("Hello ObjectOutputStream");
        oos.close();
    }

    static void listSubFiles() {
        File folder = new File("D:\\B. Tech\\3d Year\\6th Semester\\adv java"); // Change path as needed
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }

}