package service;

import model.Employee;
import model.Order;

public class Service {

    public boolean addOrderToEmployee(Employee employee, Order order) {
        try {
            employee.getOrderList().add(new Order(order.getItemName(), order.getPrice(), employee));
            return true;
        } catch (NullPointerException e) {
            System.out.println(e);
            employee.getOrderList().add(new Order("Lamborghini", 10000000, employee));
            return false;
        }
    }
}