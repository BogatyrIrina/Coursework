public class EmployerService {
    public Employee[] employee = new Employee[10];

    public double totalSum(Employee[] employee) {
        double sum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public double minSum(Employee[] employee) {
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

    public double maxSum(Employee[] employee) {
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
}