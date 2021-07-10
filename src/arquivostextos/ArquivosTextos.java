/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivostextos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author stell
 */
public class ArquivosTextos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String linha;
        String palavra;
        String diretorio = null;
        String[] caracter, palavrasP;
        int busca;
        int cont=0;
        int posicoes;
        
        Scanner teclado = new Scanner(System.in);
        
        // pergunta ao usuário qual o diretório do arquivo dele 
        System.out.println("Qual seu diretório?");
        diretorio=teclado.nextLine();
        
        File arquivo = new File(diretorio);
        
        // escolhemos o tipo de busca 
        System.out.println("Qual busca você deseja fazer?\n busca1- digite (1)\n busca2- digite (2) ");
        busca = teclado.nextInt();
        
        if(busca==1){
            System.out.println("Qual o tamanho da palavra ?");
            posicoes= teclado.nextInt();
        } else{
            if(busca==2){
                 System.out.println("Qual palavra você deseja pesquisar?");
                 palavra= teclado.nextLine();
            }
        }
        if(arquivo.exists()&& arquivo.canRead()&&!arquivo.isFile()){
            File arquivos[] = arquivo.listFiles();
            
            try{
                for(int i = 0; i < arquivos.length; i++){
                    try{
                        // tentamos fazer para que leia o arquivo
                        FileReader leitor = new FileReader(arquivos[i].getAbsoluteFile());
                        BufferedReader buffer = new BufferedReader(leitor);
                        
                        while(true){
                        // chegamos nesse erro mas não conseguimos o resolver 
                        System.out.println(arquivos[i].getAsoluteFile());
                        linha= buffer.readLine();
                        cont++;
                        
                        if(linha == null){
                            cont=0;
                        }
                        
                        palavrasP = linha.split(" ");
                        caracter = linha.split(" ");
                        
                        
                        System.out.println();
                        System.out.println(cont);
                        
                       }
                    }
                    catch(Exception e){
                        
                    }
                }
            }
        catch(Exception e){      
        }
    } else{
            System.out.println("O arquivo não existe");
       }
    }
}
    

