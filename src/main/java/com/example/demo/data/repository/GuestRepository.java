package com.example.demo.data.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.Guest;


@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

}
