package com.gwynejustin.unit_test.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gwynejustin.unit_test.BaseEntity;
import com.gwynejustin.unit_test.book.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer")
public class Customer extends BaseEntity {
    @Column(nullable = false, name = "first_name")
    private String firstName;
    @Column(nullable = false, name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private Tier tier;
    @Column(unique = true)
    private String email;
    @ManyToMany(mappedBy = "customers")
    private List<Book> books;
}
