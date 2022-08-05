public class Atleta {
    
    String nome;
    float altura;
    float peso;
    String esporte;
    String patrocinadores;
    
   
    public Atleta(String n, float a, float pe, String e, String pa){
        this.nome=n;
        this.altura=a;
        this.peso=pe;
        this.esporte=e;
        this.patrocinadores=pa;
    }
    
    public String toString(){
        return "Nome: "+nome+" | Altura: "+altura+" | Peso: "+peso+" | Esporte: "+esporte+" | Patrocinadores: "+patrocinadores;
    }
    
}
