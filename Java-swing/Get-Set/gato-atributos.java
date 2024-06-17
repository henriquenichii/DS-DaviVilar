public class gato {
    //atributos
    private String Nome;
    int idade;
    private String cor;
    String raca;
 
    // métodos
    void miar (){
        System.out.println("miau");    }
 
    void dormir (){
        System.out.println("dormindo zzzzzzzz");    }
 
    void comer (){
        System.out.println("yum yum yum");
    }
 
     public String getNome() {
    return Nome;
    }
 
    public void setNome(String Nome){
        this.Nome = Nome;
    }
 
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
 
 
   
}