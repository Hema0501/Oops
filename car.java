// PROGRAM:4
// TC1:Car("Tesla", "Red") → Output: Car started
package oops;

class cars {
    String model;
    String color;

    cars(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class car{
    public static void main(String[] args) {
    	System.out.println("HEMAPRIYA R");
		System.out.println("2117240070115");
        cars car1 = new cars("Tesla", "Red");
        car1.start();

    }
}
//OUTPUT:
HEMAPRIYA R
2117240070115
Car started




// TC2:: Car("BMW", "Black") → Output: Car started
package oops;

class cars {
    String model;
    String color;

    cars(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class car{
    public static void main(String[] args) {
    	System.out.println("HEMAPRIYA R");
		  System.out.println("2117240070115");
      cars car1 = new cars("BMW", "Black");
      car1.start();  

    }
}
//OUTPUT:
HEMAPRIYA R
2117240070115
Car started



// TC3: Car model empty → Output: Car started (but model not shown)
package oops;

class cars {
    String model;
    String color;

    cars(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class car{
    public static void main(String[] args) {
    	System.out.println("HEMAPRIYA R");
		  System.out.println("2117240070115");
      cars car1 = new cars("", "Black");
      car1.start();  

    }
}
//OUTPUT:
HEMAPRIYA R
2117240070115
Car started



// TC4: Start method not called → Output: Nothing
package oops;

class cars {
    String model;
    String color;

    cars(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class car{
    public static void main(String[] args) {
    	System.out.println("HEMAPRIYA R");
		  System.out.println("2117240070115");
      cars car1 = new cars("", "Black");
      }
}
//OUTPUT:
HEMAPRIYA R
2117240070115



//TC5: Call stop method only → Output: Car stopped
package oops;

class cars {
    String model;
    String color;

    cars(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class car{
    public static void main(String[] args) {
    	System.out.println("HEMAPRIYA R");
		  System.out.println("2117240070115");
      cars car1 = new cars("", "Black");
      car1.stop();  

    }
}
//OUTPUT:
HEMAPRIYA R
2117240070115
Car stoped





