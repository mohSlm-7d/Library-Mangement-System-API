package com.library.api.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.library.api.beans.Patron;


@Repository
public interface PatronRepository extends CrudRepository<Patron, Integer> {

}