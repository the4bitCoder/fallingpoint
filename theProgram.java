class Main {
    public static void main(String args[]) {
        double distance = 0.0f ;
        double mass = 10.0f ; // You can change the mass accordingly 
        double density = 4.0f ; // Density of the gas or liquid you a traveling through can be changed
        double gravity = 10.0f ; // You can change gravity strength accordingly (10 is earths gravity)
        double dragC = 1.0f ;
        double surfaceA = 4.0f ; // You can change the surface area accordingly 
        double velocity = 0 ;
        double timeStep = 0.01f ; // You can change the number based on what points you want to know the distance moved
        do {
            // Calculations for getting the distance moved
            double ac = (mass * gravity - 0.5 * density * velocity * dragC * surfaceA) / mass ;
            velocity = velocity + ac * timeStep ;
            distance += velocity * timeStep ;

            // Outputing the results to the screen/console
            System.out.println(distance);
        }

    }
}