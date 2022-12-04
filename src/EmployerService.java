public class EmployerService {
    public Employee[] employee = new Employee[10];

    public double calculateTotalSum(Employee[] employee) {
        double sum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public double calculateMinSum(Employee[] employee) {
        double min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (min > employee[i].getSalary()) {
                    min = employee[i].getSalary();
                }
            }
        }
        return min;
    }

    public double calculateMaxSum(Employee[] employee) {
        double max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (max < employee[i].getSalary()) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }

    public double calculateMiddleSum(Employee[] employee) {
        double middleSum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                middleSum = calculateTotalSum(employee) / employee.length;
            }
        }
        return middleSum;
    }

    public void printTitleEmployee(Employee[] employee) {
        for (Employee i : employee) {
            if (i != null) {
                System.out.println(i.getId() + ". " + "ФИО: " + i.getEmployeeName());
            }
        }
    }
}
