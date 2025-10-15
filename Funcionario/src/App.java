import entities.LiderTecnico;
import entities.Programador;

public class App {
    public static void main(String[] args) throws Exception {
        Programador p1 = new Programador("Davi Marques", 2000);
        System.out.println(p1.toString());

        System.out.println("-------");

        LiderTecnico lt1 = new LiderTecnico("Paula Fernandes", 3500);
        System.out.println(lt1.toString());
    }
}
