package com.ust.itembatch.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.itembatch.entity.ReceivedItem;

@Repository
public interface BatchRepository extends JpaRepository<ReceivedItem, String> {
	List<ReceivedItem> findAll();
}
