package creatures;
import com.company.*;

public class FarmAnimal extends Animal implements Edible {
   public  FarmAnimal(String species){
        super(species);
    }
public void beEaten(){
        System.out.println("You can eat these animals.");
}
}
