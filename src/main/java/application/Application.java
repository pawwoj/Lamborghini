package application;

import model.Employee;
import model.Order;
import service.Service;

public class Application {
    Service service = new Service();

    public void run() {
        Employee employee1 = new Employee("Jan", "Kowalski");
        Order order1 = new Order("Spodnie", 500);

        service.addOrderToEmployee(employee1, order1);
        service.addOrderToEmployee(employee1, null);

        System.out.println(employee1);
    }
}