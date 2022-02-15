
package com.mycompany.sistemacontroleestoque.controller.utils;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */

import com.mycompany.sistemacontroleestoque.model.Estoque;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JSON {
    
    public static String toJSON(Estoque produto){
        Gson gson = new Gson();
        return gson.toJson(produto);
    }

    public static String toJSON(List<Estoque> estoques){
        Gson gson = new Gson();
        return gson.toJson(estoques);
    }
    
    public static Estoque toEtoque(String json){
        Gson gson = new Gson();
        Estoque estoque = gson.fromJson(json, Estoque.class);
        return estoque;
    }
    
    
    public static List<Estoque> toEstoques(String json){
        Gson gson = new Gson();
        Type estoquesTipo = new TypeToken<ArrayList<Estoque>>(){}.getType();
        List<Estoque> estoques = gson.fromJson(json, estoquesTipo);
        return estoques;
    }
    
    
   /* public static void main(String[] args) {

        List<Estoque> estoques = new ArrayList<>();
        
        
        String json = JSON.toJSON(estoques);
        System.out.println("json = " + json);
        
        for (Estoque estoque : JSON.toEstoques(json)) {
            System.out.println(estoque);
        }
    }
    */
}