package HerancaPolimorfismo.ExemploHerancaPolimorfismo;

public class Main {
    public static void main(String[] args){
        CarroInteligente tiguan = new CarroInteligente(10);
        for (int i = 10; i > 0; i--) {
            tiguan.freia();
        }
        tiguan.estaciona();

        CarroCorrida f1 = new CarroCorrida(10);
        f1.acelera();
        f1.mostraVelocidade();
    }
}
