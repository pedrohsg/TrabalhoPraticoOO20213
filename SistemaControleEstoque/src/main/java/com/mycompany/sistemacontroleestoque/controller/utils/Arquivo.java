
package com.mycompany.sistemacontroleestoque.controller.utils;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Arquivo {

    public static String lendoArquivo(String caminho) throws FileNotFoundException {

        StringBuilder conteudo = new StringBuilder();

        File arquivoEstoque = new File(caminho);

        Scanner leitor = new Scanner(arquivoEstoque);

        while (leitor.hasNextLine()) {
            conteudo.append(leitor.nextLine()).append("\n");
        }

        return conteudo.toString();
    }

    public static void escrevendoArquivo(String caminho, String conteudo) throws IOException {
        FileWriter fileWriterArquivo;
        BufferedWriter bufferedWriterArquivo;

        File arquivoEstoque = new File(caminho);

        fileWriterArquivo = new FileWriter(arquivoEstoque, false);
        bufferedWriterArquivo = new BufferedWriter(fileWriterArquivo);

        bufferedWriterArquivo.write(conteudo);

        bufferedWriterArquivo.close();
        fileWriterArquivo.close();

    }
}