package com.cwhcode.navtodo;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Item, Long> {
}
