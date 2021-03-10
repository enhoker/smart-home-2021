package ru.sbt.mipt.oop;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

//import java.io.BufferedWriter;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Arrays;

public class HomeBuilder {

    public static void main(String[] args) throws IOException {
        SmartHome smartHome = Builder.build();
        HomeOut.outHome(smartHome);
    }
}
