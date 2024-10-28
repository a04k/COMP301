public class App {
    public static void main(String[] args) {
        testStudentSystem();
        System.out.println("\n-------------------\n");
        testCarSystem();
    }
    
    private static void testStudentSystem() {
        System.out.println("Testing Student Management System");
        
        try {
            StudentTest studentTest = new StudentTest();
            
            Date date1 = new Date(14, 9, 2004);
            int[] grades1 = {95, 88, 92};
            double[] cgpas1 = {3.7, 3.8, 3.9, 3.7, 3.8};
            Student student1 = new Student("Ahmed1", date1, grades1, cgpas1);
            
            Date date2 = new Date(14, 9, 1999);
            int[] grades2 = {65, 70, 68};
            double[] cgpas2 = {1.9, 1.8, 2.2, 2.3, 2.4};
            Student student2 = new Student("Ahmed2", date2, grades2, cgpas2);
            
            studentTest.insertStudent(student1);
            studentTest.insertStudent(student2);
            
            System.out.println("Highest degree students:");
            for (Student s : studentTest.findHighestDegreeStudents()) {
                System.out.println(s);
            }
            
            System.out.println("\nStudents on probation:");
            for (Student s : studentTest.findProbationStudents()) {
                System.out.println(s);
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void testCarSystem() {
        System.out.println("Testing Car Management System");
        
        CarTest carTest = new CarTest();
        
        carTest.addCar(new Car("X5", "BMW", 2000000, 2023));
        carTest.addCar(new Car("Camry", "TOYOTA", 1000000, 2024));
        carTest.addCar(new Car("X7", "BMW", 2500000, 2022));
        carTest.addCar(new Car("Corolla", "TOYOTA", 650000, 2011));
        
        System.out.println("Car list:");
        carTest.displayAllCars();
        
        carTest.replaceBMWX5WithX6();
        System.out.println("\nAfter replacing BMW X5 with X6:");
        carTest.displayAllCars();
        
        carTest.removeOldToyotas();
        System.out.println("\nAfter removing old Toyotas:");
        carTest.displayAllCars();
    }
}