public class HelloWorld{

     public static void main(String []args){
        
        int[] classGrades = new int[10];
        
        classGrades[0] = 95;
        classGrades[1] = 42;
        classGrades[2] = 57;
        classGrades[3] = 69;
        classGrades[4] = 100;
        classGrades[5] = 55;
        classGrades[6] = 87;
        classGrades[7] = 93;
        classGrades[8] = 87;
        classGrades[9] = 88;
        
        System.out.println(classGrades[4]);
        System.out.println(classGrades[6]);
        System.out.println(classGrades[0]);
        System.out.println(classGrades[9]);
        System.out.println((classGrades[4] + classGrades[5] + classGrades[9]) / 3);
        System.out.println("The first grade in the list is: " + classGrades[0]);
        System.out.println("The fourth grade in the list is: " + classGrades[3]);
        System.out.println("The fifth grade in the list is: " + classGrades[4]);
        System.out.println("The tenth grade in the list is: " + classGrades[9]);
     }
}
