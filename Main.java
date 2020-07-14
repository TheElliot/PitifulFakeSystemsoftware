import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {

static String java_text = "";
static String js_text = "";
static String py_text = "";

  public static void main(String[] args) {
    try {
      File data_file = new File("datafile.txt");
      Scanner file_scanner = new Scanner(data_file);
      java_text = file_scanner.nextLine();
      py_text = file_scanner.nextLine();
      js_text = file_scanner.nextLine();
      file_scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    System.out.println(java_text);
    System.out.println(py_text);
    System.out.println(js_text);

  }
}