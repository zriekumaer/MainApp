package com.ust.itembatch.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.UserAuthentication.service.UserService;
import com.ust.itembatch.entity.ReceivedItem;
import com.ust.itembatch.service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController {

	@Autowired
	private BatchService batchService;

	private UserService UserService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<ReceivedItem> getBatch() {
		List<ReceivedItem> receivedItems = batchService.getRecivedItemList();
		if (UserService.isValidToken("js37wewh")) {
			if (receivedItems != null) {
				return receivedItems;
			} else {
				return new ArrayList<ReceivedItem>();
			}
		} else {
			return new ArrayList<ReceivedItem>();
		}

	}
}
