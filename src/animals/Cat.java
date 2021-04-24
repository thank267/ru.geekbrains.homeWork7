import utils.Plate;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean fullness = false;

    /**
     * @param name
     * @param appetite
     */
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the appetite
     */
    public int getAppetite() {
        return appetite;
    }

    /**
     * @return the fullness
     */
    public boolean isFullness() {
        return fullness;
    }

    /**
     * @param fullness the fullness to set
     */
    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void eat(Plate p) {
   
        setFullness(p.decreaseFood(appetite)); ;

        if (isFullness()) {
            System.out.printf("Кот %s поел. Он сыт\n", getName());
        }
        else {
            System.out.printf("\nКот %s голоден. В тарелке: %s; потребности кота: %s\n\n", getName(), p.getFood(),getAppetite());
        }

    }

    
}