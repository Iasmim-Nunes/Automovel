package br.edu.unifaj.poo.automovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAutomovel {

   public static void main(String[] args) {
       MenuAutomovel obj = new MenuAutomovel();
       obj.menu();
       System.out.println("Fim do menu automóvel");
   }
   static int contador = 1;
   List<Automovel> lista = new ArrayList<>();


   public void menu(){
       System.out.println("Iniciando menu automóvel");
       Scanner sc = new Scanner(System.in);

    while(true) {
           System.out.println("1 - Listar");
           System.out.println("2 - Incluir");
           System.out.println("3 - Excluir");
           System.out.println("4 - Sair");
           System.out.println("Opção: ");
           int opcao = sc.nextInt();
           sc.nextLine(); // Consome o final da linha \n


           switch (opcao) {
               case 1:
                   listar();
                   break;
               case 2:
                   incluir(sc);
                   break;
               case 3:
                   excluir(sc);
                   break;
               case 4:
                   return;
               default:
                   System.out.println("Opção inválida" + opcao);
           }
       }


   } // Fim do metodo menu


   private void sair() {

   }


   private void excluir(Scanner sc) {
       System.out.println("Excluir Automovel");
       System.out.print("Placa a pesquisar:");
       String placa = sc.nextLine();


       for (int i = 0; i < lista.size(); i++){
           Automovel a = lista.get(i);
           if (a.placa.equals(placa)){
               lista.remove(i);
               System.out.println("Automóvel excluido com sucesso");
               return;
           }
       }
       System.out.println("Placa não encontrada na lista");
   }


   private void incluir(Scanner sc) {
       System.out.println("Incluir automovel");
       System.out.print("Placa:");
       String placa = sc.nextLine();


       System.out.print("Número de portas:");
       int numPortas = sc.nextInt();
       sc.nextLine();


       System.out.print("Combustivel: ");
       String combustivel = sc.nextLine();


       System.out.print("Modelo: ");
       String modelo = sc.nextLine();


       // Criar o objeto automove4l
       Automovel  automovel = new  Automovel(contador++, placa, numPortas, combustivel, modelo);
       lista.add(automovel);
   }


   private void listar() {
       for (int i = 0;  i < lista.size(); i++){
           Automovel a = lista.get(i);
           System.out.println("Automovel" + a.id + "Placa" + a.placa + "Número de Portas" + a.numPortas
           + "Combustivel:" + a.combustivel + "Modelo" + a.modelo);
       }
   }
} // Fim da classe
