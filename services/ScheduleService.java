package com.bitcamp.services;

import com.bitcamp.domains.ScheduleBean;

public class ScheduleService {
	
	private ScheduleBean[] scheduleBeans;
	private int count;
	
	public ScheduleService() {
		scheduleBeans = new ScheduleBean[10];
		count = 0 ;
	}
}
