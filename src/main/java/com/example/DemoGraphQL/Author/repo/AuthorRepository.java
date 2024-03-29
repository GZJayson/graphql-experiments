package com.example.DemoGraphQL.Author.repo;

import com.example.DemoGraphQL.Author.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
