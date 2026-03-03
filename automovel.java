public class Automovel {
   int id;
   String placa;
   int numPortas;
   String combustivel;
   String modelo;

   // Construtor Padrão ou Default
   public Automovel(){
   }

   // Construtor com Inicialização
   public Automovel(int id, String placa, int numPortas, String combustivel, String modelo) {
       this.id = id;
       this.placa = placa;
       this.numPortas = numPortas;
       this.combustivel = combustivel;
       this.modelo = modelo;
   }
}
