public class App {
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();

        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());

        ausgabe("--------------------");

        ausgabe(queen.fly());
        ausgabe(worker.fly());
        ausgabe(drone.fly());

        ausgabe("--------------------");

        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());

        ausgabe("---------- Flug Contest ----------");

        flyingCompetition(queen);
        flyingCompetition(drone);
        flyingCompetition(worker);
        flyingCompetition(bird);


        // Das sollte eigentlich nicht möglich sein
	    // --> Lösung: Abstrakte Klasse 
        // HoneyBee bee = new HoneyBee();
        // ausgabe(bee.doYourJob());

    }

    private static void flyingCompetition(Flyable obj){
        ausgabe(obj.fly());
    }


    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }

}
