package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        Algorithm algorithm = new Algorithm();
        algorithm.doDjikstra(fileReader.loadMatrix());
    }
}