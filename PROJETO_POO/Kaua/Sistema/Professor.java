public class Professor extends Pessoa{

    private int ID;


    
    public Professor(String Nome_completo, int Senha,  int ID){
        super(Nome_completo, Senha);
        this.ID = ID;
    }



    public int getID(){return ID;}
    public void setID(int ID){this.ID = ID;}


    @Override
    public String toString(){

        return "Professor: " + Nome_completo + "\nIdentificador: " + ID;
    }
    

}