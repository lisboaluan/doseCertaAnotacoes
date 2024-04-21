import java.util.*;

public class Anotacao {

    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    Formatacao formatacao = new Formatacao();
    Date data = new Date();

    public void lerAnotacao(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Como esta sendo seu dia? ");
        setTexto(leitura.nextLine()) ;
        formatacao.quebraLinha();
        System.out.println(getTexto());
        System.out.println(data);
    }

}
