package CriandoUmaClasse;

public class Cell {
    private String name;
    private boolean isOpen;

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    private int securityCode;

    public Cell(String name, boolean isOpen, int securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    public String getName(){
        return name;
    }

    public boolean getIsOpen(){
        return isOpen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsOpen(int securityCode){
        if (securityCode != this.securityCode)
            System.out.println("The code is incorrect");
        else{
            if(this.getIsOpen()){
                this.isOpen = false;
            }else
                this.isOpen = true;
        }
        System.out.println("The cell is open: "+this.getIsOpen());
    }
}
