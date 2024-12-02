package hust.soict.hedspi.garbage;
import java.io.*;
import java.nio.file.*;

public class GarbageCreator {
 public static void main(String[] args) throws IOException {
     String filename = "D:\\code vao day\\projectJava\\lop thuc hanh\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\test.text";
     byte[] inputBytes = { 0 };
     long startTime, endTime;
     inputBytes = Files.readAllBytes(Paths.get(filename));
     startTime = System.currentTimeMillis();
     String outputString = "";
     for (byte b : inputBytes) {
         outputString += (char) b;
     }
     endTime = System.currentTimeMillis();
     System.out.println(endTime - startTime);
 }
}
