
package recipe;
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author TomD
 * Java bean class!!
 * Three Rules
 * 1) No Argument constructor
 * 2) Public get set methods for ALL attributes
 * 3) implements Serializable 
 * also known as POJO - plain old java object
 */
public class Recipe implements Serializable {
    
    //Attributes
    private String directions;
    ArrayList <Ingredient> ingredients;
    //Ingredients
    public Ingredient ingredient1 = new Ingredient("milk","ounces",2);
    public Ingredient ingredient2 = new Ingredient("eggs","each",4);    
    public Ingredient ingredient3 = new Ingredient("flour","cups",8);
     
    //Constructor no parameters
    public Recipe() {
        
        //Create array list of ingrediants
        ingredients = new ArrayList<Ingredient>();
        
        //Add Ingredients
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);        
        ingredients.add(ingredient3); 
        
        this.directions = "";
         
    }
    //Constructor with parameters
    public Recipe(String directions) {
        
        //Create array list of ingrediants
        ingredients = new ArrayList<Ingredient>();
        
        //Add Ingredients
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);        
        ingredients.add(ingredient3);          
        this.directions = directions; 
    }
    
    //Getters and Setters
    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
    
}
