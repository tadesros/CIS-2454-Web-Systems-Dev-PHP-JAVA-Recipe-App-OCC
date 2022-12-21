package recipe;
import java.io.Serializable;
/**
 * @author TomD
 * Java bean class!!
 * Three Rules
 * 1) No Argument constructor
 * 2) Public get set methods for ALL attributes
 * 3) implements Serializable 
 * also known as POJO - plain old java object
 */
public class Ingredient implements Serializable {
    
    //Attributes
    private String name;
    private String measure;
    private double quantity;
    //Constructor: no parameters
    public Ingredient() {
        name = "";
        measure = "";
        quantity = 0;
    }
    //Constructor: with parameters
    public Ingredient(String name, String measure, double quantity) {
        this.name = name;
        this.measure = measure;
        this.quantity = quantity;
    }    
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }   
}
