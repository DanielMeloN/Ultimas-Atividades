import java.util.*;
import java.time.*;

class Questao1{
	public static void main(String[] args) {
    Agenda agenda = new Agenda();
    agenda.armazenaPessoa("Luka", 24, 2.02);
    agenda.armazenaPessoa("James", 38, 2.07);
    System.out.println(agenda.buscaPessoa("Luka"));
    agenda.imprimeAgenda();
    agenda.imprimePessoa(1);
    agenda.removePessoa("Luka");
    agenda.imprimeAgenda();
  }
}

class Pessoa{
		    private String nome = "";
            private Date DatadeNascimento;
            private Double Altura;
            private int Idade;
        
            public void setNome(String nome){
                this.nome = nome;
            }
        
            public void setData(Date Data){
                this.DatadeNascimento = Data;
            }   
        
            public void setTamanho(Double tamanho){
                this.Altura = tamanho;
            }
            
            public void setIdade(int Year){
                this.Idade = Year;
            }
        
            public String getNome(){
                return nome;
            }
        
            public Date getData(){
                return DatadeNascimento;
            }
        
            public Double getTamanho(){
                return Altura;
            }
            
            public int getIdade(){
                return Idade;
            }
            public void imprimi(){
                System.out.println("Nome: " + nome);
                System.out.println("Data de Nascimento: " + DatadeNascimento);   
                System.out.println("Altura: " + Altura);   
            }
        
            public int calculaIdade(){
                Calendar dN = new GreogorianCalendar();
                dN.setTime(DatadeNascimento);
                Calendar today = Calendar.getInstance();
                int idade = today.get(Calendar.YEAR) - dN.get(Calendar.YEAR);
                this.Idade = idade;
                return idade;
            }
}
 class Agenda{
        private Pessoa pessoas[] = new Pessoa[10];
        public Agenda() {
            for (int i = 0; i <= 9; i++) {
                pessoas[i] = new Pessoa();
            }
        }
        public void armazenaPessoa(String nome, int idade, double altura){
            for(int i=0; i<10; i++){
                if(pessoas[i].getNome() == ""){
                    pessoas[i].setNome(nome);
                    pessoas[i].setTamanho(altura);
                    pessoas[i].setIdade(idade);
                    i = 10;
                }
            }
        }
        public void removePessoa(String nome){
            for(int i=0; i<10; i++){
                if(pessoas[i].getNome() == nome){
                    pessoas[i].setNome("");
                    pessoas[i].setTamanho(0.0);
                    pessoas[i].setIdade(0);
                    i = 10;
                }
            }
        }
        public int buscaPessoa(String nome) {
            for (int i = 0; i < 10; i++) {
                if (pessoas[i].getNome() == nome) {
                    return i;
                 }
            }
            return -1;
        }
        public void imprimeAgenda() {
            for (int i = 0; i < 10; i++) {
                pessoas[i].imprimi();
                System.out.println("");
            }
        }
        public void imprimePessoa(int x) {
            pessoas[x].imprimi();
        }
} 

	    