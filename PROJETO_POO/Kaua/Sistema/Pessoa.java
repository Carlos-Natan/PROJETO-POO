public class Pessoa {

    protected  String Nome_completo;
    
    protected  int Senha;

    

    public Pessoa(String Nome_completo, int Senha){
        this.Nome_completo = Nome_completo;
        this.Senha = Senha;}



    public String getNome_completo(){return Nome_completo;}
    public void setNome_completo(String Nome_completo){this.Nome_completo = Nome_completo;}




    public int getSenha(){return Senha;}
    public void setSenha(int Senha){this.Senha = Senha;}
}