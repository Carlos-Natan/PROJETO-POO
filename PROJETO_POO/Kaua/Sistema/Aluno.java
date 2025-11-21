public class Aluno extends Pessoa{

    private int Matricula;

    
    
    public Aluno(String Nome_completo, int Senha, int Matricula){
        super(Nome_completo, Senha);
        this.Matricula = Matricula;}



    public int getMatricula(){return Matricula;}
    public void setMatricula(int Matricula){
        this.Matricula = Matricula;}
    


    @Override
    public String toString(){

        return "Aluno: " + Nome_completo + "\nMatricula: " + Matricula;
    }
    
}

