package school.mjc.stage0.conditions.finalTask;

public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < firstSide + secondSide) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}