package edu.fiuba.algo3.modelo;


import com.google.gson.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Computadora {
    private ArrayList ladrones;

    public Computadora(){

        try {
            ladrones = new ArrayList();
            JsonElement json = JsonParser.parseReader(new FileReader("src/main/java/edu/fiuba/algo3/modelo/ladrones.json"));
            Gson gson = new Gson();
            JsonArray array = json.getAsJsonArray();

           for(JsonElement elemento : array){
               //System.out.println(elemento);
               Ladron ladron = gson.fromJson(elemento,Ladron.class);
               System.out.println(ladron.getHobby());
           }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
