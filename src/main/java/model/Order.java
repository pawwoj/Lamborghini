package model;


import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

    @NonNull
    String itemName;
    @NonNull
    int price;

    Employee employee;

    @Override
    public String toString() {
        return this.itemName + " " + this.price + " " +
                this.employee.getFirstName() + " " + this.employee.getLastName();
    }
}