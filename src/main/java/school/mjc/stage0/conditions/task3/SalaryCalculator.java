package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        //Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0

        if (salary <= 10000){
            int taxes = (int) (salary*0.15);
            System.out.println(salary-taxes);
        } 
        else if (10000 < salary || salary<=20000) {
            int taxes = (int) (salary*0.18);
            System.out.println(salary-taxes);
        } else if (salary > 20000) {
            int taxes = (int) (salary*0.20);
            System.out.println(salary-taxes);
        } else if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
