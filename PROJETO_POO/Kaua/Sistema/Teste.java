
public class Teste {

    public static void main (String []arg){

        Aluno Kaua = new Aluno("Kaua", 123, 456);
        Professor Victor = new Professor("Victor", 321, 654);
        

        System.out.println("\033[30;47mSISTEMA\033[0m");
        System.out.println(Kaua);
        System.out.println(Victor);

    }
}