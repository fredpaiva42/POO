package CriandoUmaClasse;

public class Prisoner {
    private String name;
    private double height;
    private int sentence;
    private Cell cell;

    public Prisoner(){
        this(null, 0.0, 0, null);
    }

    public Prisoner(String name, double height, int sentence, Cell cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
    }

    public void displayPrisoner(){
        this.displayPrisoner(false);
    }

    public void displayPrisoner(boolean isThink){
        System.out.println("Name: "+ name);
        System.out.println("Height: "+height);
        System.out.println("Sentence: "+sentence);
        System.out.println("Cell: "+cell.getName());
        if(isThink)
            this.think();
    }

    public void think(){
        System.out.println("I'll have my revenge.");
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public int getSentence(){
        return sentence;
    }

    public Cell getCell(){
        return cell;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setSentence(int sentence){
        this.sentence = sentence;
    }

    public void setCell(Cell cell){
        this.cell = cell;
    }

}
