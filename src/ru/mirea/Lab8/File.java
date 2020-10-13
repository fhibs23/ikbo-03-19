package ru.mirea.Lab8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

    public class File {

        private static final String FILE_PATH = "C:\\Users\\Lena\\Desktop\\универ\\КУРС2\\Java\\";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите текст для записи в файл file.txt:");
                writeFile(FILE_PATH + "file.txt", scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeFile(String filename, String data) throws IOException {
            Path path = Paths.get(filename);
            Charset charset = StandardCharsets.UTF_8;
            try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
                writer.write(data, 0, data.length());
            }
        }


    }
