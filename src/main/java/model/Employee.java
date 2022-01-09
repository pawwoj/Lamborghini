package model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class Employee {
    @NonNull
    String firstName;
    @NonNull
    String lastName;
    List<Order> orderList = new ArrayList<>();

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.orderList;
    }
}