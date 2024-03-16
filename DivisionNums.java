

public class DivisionNums implements Operation {
   

    @Override
    public double exec(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Ошибка: нельзя делить на ноль!!!");
        }
        return (num1 / num2);
        }
    }



