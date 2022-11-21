package CriandoUmaClasse;

public class PrisonerTest {
    public static void main(String[] args){
        Cell a1 = new Cell("A1",false, 1234);
        Cell a2 = new Cell("A2", false, 4567);
        Guard jorge = new Guard("Jorge");
        Prisoner bubba = new Prisoner("Bubba", 2.03, 4, a1);
        Prisoner twitch = new Prisoner("Twitch", 1.73, 3, a2);
        Prisoner p02 = new Prisoner();
        bubba.displayPrisoner();
        jorge.openDoor(1234, a1);
    }
}
