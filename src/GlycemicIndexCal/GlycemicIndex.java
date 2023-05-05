
package GlycemicIndexCal;

/**
 *
 * @author Aysenur
 */
public class GlycemicIndex {
    public String foodName;
    public int foodIndex;
    public int foodAmount;
    GlycemicIndex(String foodName, int foodIndex, int foodAmount)
    {
        this.foodName=foodName;
        this.foodIndex=foodIndex;
        this.foodAmount=foodAmount;
    }
    public String getName()
    {
        return this.foodName;
    }
    public void setName(String foodName)
    {
        this.foodName=foodName;
    }
    public int getIndex(){
        return this.foodIndex;
    }
    public void setIndex(int foodIndex)
    {
        this.foodIndex=foodIndex;
    }
    public int getAmount(){
        return this.foodAmount;
    }
    public void setAmount(int foodAmount)
    {
        this.foodAmount=foodAmount;
    }
    public void getGlisemic()
    {
       System.out.println("The glisemic index of the food in this amount:"+(this.foodAmount * this.foodIndex)/100);
    }
}
class Grain extends GlycemicIndex
{
    public Grain(String foodName, int foodIndex, int foodAmount) {
        super(foodName, foodIndex, foodAmount);
    }
}
class Fruit extends GlycemicIndex{
	 public Fruit(String foodName, int foodIndex, int foodAmount) {
	        super(foodName, foodIndex, foodAmount);
	    }
}
class Vegetables extends GlycemicIndex{
	public Vegetables(String foodName, int foodIndex, int foodAmount) {
        super(foodName, foodIndex, foodAmount);
    }
}
class Legume extends GlycemicIndex{
	public Legume(String foodName, int foodIndex, int foodAmount) {
        super(foodName, foodIndex, foodAmount);
    }
}
class Beverages extends GlycemicIndex{
	public Beverages(String foodName, int foodIndex, int foodAmount) {
        super(foodName, foodIndex, foodAmount);
    }
}


