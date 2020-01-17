package com.ust.itembatch.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.itembatch.entity.ReceivedItem;

@Service
public interface BatchService {

	public List<ReceivedItem> getRecivedItemList();
}
