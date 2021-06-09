public class Bird implements Flyable, IFeathers{

    @Override
    public String hasFeathers() {
        return "I'm a bird, i have feathers!";
    }

    @Override
    public String fly() {
        return "I'm a bird, I fly at 25 mph!";
    }

    
}//end Bird
