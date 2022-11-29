public class Main {
    public static void main(String[] args) {

        EmployerService employerService = new EmployerService();

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иван", "Иванович", "Иванов", 1, 50000);
        employee[1] = new Employee("Петр", "Петрович", "Петров", 1, 45000);
        employee[2] = new Employee("Сидор", "Сидорович", "Сидоров", 2, 60000);
        employee[3] = new Employee("Максим", "Максимович", "Максимов", 2, 55000);
        employee[4] = new Employee("Федор", "Федорович", "Федоров", 3, 65000);
        employee[5] = new Employee("Захар", "Захарович", "Захаров", 3, 70000);
        employee[6] = new Employee("Мирон", "Миронович", "Миринов", 4, 40000);
        employee[7] = new Employee("Афанасий", "Афанасьевич", "Афанасьев", 4, 75000);
        employee[8] = new Employee("Макар", "Макарович", "Макаров", 5, 35000);
        employee[9] = new Employee("Семен", "Семенович", "Семенов", 5, 74000);
        for (Employee i : employee) {
            System.out.println(i);
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + employerService.calculateTotalSum(employee) + " рублей");
        System.out.println("Сотрудник с минимальной заплатой: " + employerService.calculateMinSum(employee) + " рублей");
        System.out.println("Сотрудник с максимальной заплатой: " + employerService.calculateMaxSum(employee) + " рублей");
        System.out.println("Среднее значение зарплат: " + employerService.calculateTotalSum(employee)/employee.length + " рублей");
    }
}