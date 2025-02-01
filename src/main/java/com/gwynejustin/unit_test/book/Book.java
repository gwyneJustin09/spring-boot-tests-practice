package com.gwynejustin.unit_test.book;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gwynejustin.unit_test.BaseEntity;
import com.gwynejustin.unit_test.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "book")
public class Book extends BaseEntity {
    @Column(nullable = false)
    private String title;
    private String author;
    private Genre genre;
    private Boolean available;
    @ManyToMany
    @JoinTable(
            name = "book-customer",
            joinColumns = @JoinColumn(name = "book"),
            inverseJoinColumns = @JoinColumn(name = "customer")
    )
    private List<Customer> customers;
}
