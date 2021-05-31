package creatures;
import com.company.*;

public class FarmAnimal extends Animal implements Edible {
   public  FarmAnimal(String species){
        super(species);
    }
public void beEaten(){
        this.weight = 0.00;
        System.out.println("This animal has been eaten.");
}
}
