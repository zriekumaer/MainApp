package com.ust.itembatch.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ust.itembatch.entity.ReceivedItem;
import com.ust.itembatch.repo.BatchRepository;

public class BatchServiceImpl implements BatchService {

	@Autowired
	private BatchRepository batchRepository;

	public List<ReceivedItem> getRecivedItemList() {
		return batchRepository.findAll();
	}

}
