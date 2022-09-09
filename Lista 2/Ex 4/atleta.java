public class atleta {
    String nome;
    float altura;
    float peso;
    String esporte;
    String patrocinadores;
    
    
    public atleta(String nome, float altura, float peso, String esportes, String patrocina){
        this.nome=nome;
        this.altura=altura;
        this.peso=peso;
        this.esporte=esportes;
        this.patrocinadores=patrocina;
    }
    
    public String toString(){
        return "Nome:"+nome+" | Altura:"+altura+" | Peso:"+peso+" | Esporte:"+esporte+" | Patrocinadores:"+patrocinadores;
    }
}
