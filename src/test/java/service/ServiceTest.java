package service;

import model.Employee;
import model.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceTest {
    Service service = new Service();

    @Test
    void addOrderToEmployee_returnTrueWhenAddedOrderIsLegit() {
        Employee employee1 = new Employee("Jan", "Kowalski");
        Order order1 = new Order("Spodnie", 500);

        assertThat(service.addOrderToEmployee(employee1, order1)).isEqualTo(true);
    }

    @Test
    void addOrderToEmployee_returnFalseWhenAddedOrderIsNull() {
        Employee employee1 = new Employee("Jan", "Kowalski");

        assertThat(service.addOrderToEmployee(employee1, null)).isEqualTo(false);
    }

    @Test
    void addOrderToEmployee_OrderListContainLamborghiniWhenAddedOrderIsNull() {
        Employee employee1 = new Employee("Jan", "Kowalski");
        service.addOrderToEmployee(employee1, null);
        Order orderWhenNull = new Order("Lamborghini", 10000000, employee1);

        assertThat(employee1.getOrderList()).contains(orderWhenNull);
    }

    @Test
    void addOrderToEmployee_OrderListDontContainLamborghiniWhenAddedOrderIsLegit() {
        Employee employee1 = new Employee("Jan", "Kowalski");
        Order order1 = new Order("Spodnie", 500);
        Order orderWhenNull = new Order("Lamborghini", 10000000, employee1);
        service.addOrderToEmployee(employee1, order1);

        assertThat(employee1.getOrderList()).doesNotContain(orderWhenNull);
    }
}