public class Student {
    private int rollingNumber;
    private String name;
    private Date birthDate;
    private static final int MAX_DEGREE = 100;
    private int[] subjectDegrees = new int[3];
    private double[] semesterCGPAs = new double[5];
    private static int count = 0;
    
    public Student(String name, Date birthDate, int[] degrees, double[] cgpas) {
        this.rollingNumber = ++count;
        this.name = name;
        this.birthDate = birthDate;
        
        if (degrees.length != 3 || cgpas.length != 5) 
            throw new IllegalArgumentException("Invalid array length");
            
        for (int i = 0; i < 3; i++) {
            if (degrees[i] < 0 || degrees[i] > MAX_DEGREE)
                throw new IllegalArgumentException("Invalid degree");
            this.subjectDegrees[i] = degrees[i];
        }
        System.arraycopy(cgpas, 0, this.semesterCGPAs, 0, 5);
    }
    
    public String calculateGrade() {
        double avg = 0;
        for (int degree : subjectDegrees) avg += degree;
        avg /= 3.0;
        
        if (avg >= 90) return "A";
        if (avg >= 85 && avg < 90) return "A-";
        if (avg >= 80 && avg < 85) return "B+";
        if (avg >= 75 && avg < 80) return "B";
        if (avg >= 70 && avg < 75) return "C+";
        if (avg >= 65 && avg < 70) return "C";
        if (avg >= 60 && avg < 65) return "D";
        return "F";
    }
    
    public boolean isOnProbation() {
        for (int i = 0; i < 4; i++) 
            if (semesterCGPAs[i] < 2.0 && semesterCGPAs[i + 1] < 2.0) 
                return true;
        return false;
    }
    
    public int getTotalDegree() {
        int total = 0;
        for (int degree : subjectDegrees) total += degree;
        return total;
    }
    
    @Override
    public String toString() {
        return String.format("Student #%d: %s, Birth: %s, Grade: %s", 
            rollingNumber, name, birthDate, calculateGrade());
    }
}