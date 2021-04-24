package utils;

public class Plate {

    private int food;

    /**
     * @param food
     */
    public Plate(int food) {
        this.food = food;
    }

    

    /**
     * @return the food
     */
    public int getFood() {
        return food;
    }



    /**
     * @param food the food to set
     */
    public void setFood(int food) {
        this.food = food;
    }



    public boolean decreaseFood(int amount) {

        final int balanceFood = getFood() - amount;

        if (balanceFood >= 0) {
            setFood(balanceFood);
            return true;
        }

        return false;

    }
    
    public void increaseFood(int amount) {
        
        setFood(getFood() + amount);
 
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
    
}
