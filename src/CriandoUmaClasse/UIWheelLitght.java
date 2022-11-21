package CriandoUmaClasse;

public class UIWheelLitght {
    public UIWheel wheel;
    public double rotation;
    public boolean isLit;

    public UIWheelLitght(UIWheel wheel, double rotation){
        this(wheel, rotation, false);
    }

    //Constructor
    public UIWheelLitght(UIWheel wheel, double rotation, boolean isLit){
        this.wheel = wheel;
        this.rotation = rotation;
        this.isLit = isLit;
    }
}
