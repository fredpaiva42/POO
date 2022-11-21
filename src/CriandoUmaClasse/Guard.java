package CriandoUmaClasse;

public class Guard {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Guard(String name){
        this.name = name;
    }

    public void openDoor(int securityCode, Cell cell){
        cell.setIsOpen(securityCode);
    }
}
