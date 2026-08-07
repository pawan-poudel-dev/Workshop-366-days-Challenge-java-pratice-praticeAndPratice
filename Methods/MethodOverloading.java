class MethodOverloading{

    // 1. Original method: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Overloaded method: Different NUMBER of parameters (handles 3 integers)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded method: Different DATA TYPE of parameters (handles 2 doubles)
    public double add(double a, double b) {
        return a + b;
    }
}

    public static void main(String[] args) {
        Calculator calc = new ();

        // Calls the first method: add(int, int)
        int sum1 = calc.add(5, 10);

        // Calls the second method: add(int, int, int)
        int sum2 = calc.add(5, 10, 20);

        // Calls the third method: add(double, double)
        double sum3 = calc.add(5.5, 10.5);

        // Print results to the console
        System.out.println("Sum of 2 ints: " + sum1);  // Output: 15
        System.out.println("Sum of 3 ints: " + sum2);  // Output: 35
        System.out.println("Sum of 2 doubles: " + sum3); // Output: 16.0
    }
}

    // 1. Original method: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Overloaded method: Different NUMBER of parameters (handles 3 integers)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded method: Different DATA TYPE of parameters (handles 2 doubles)
    public double add(double a, double b) {
        return a + b;
    }
}

 class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the first method: add(int, int)
        int sum1 = calc.add(5, 10);

        // Calls the second method: add(int, int, int)
        int sum2 = calc.add(5, 10, 20);

        // Calls the third method: add(double, double)
        double sum3 = calc.add(5.5, 10.5);

        // Print results to the console
        System.out.println("Sum of 2 ints: " + sum1);  // Output: 15
        System.out.println("Sum of 3 ints: " + sum2);  // Output: 35
        System.out.println("Sum of 2 doubles: " + sum3); // Output: 16.0
    }
}
