package com.swim.arn.serial;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface SerialService {
	public List<Serial> retrieveSerials();
	 
	 public Serial getSerial(int serialId);
	 
	 public void saveSerial(Serial serial);
	 
	 public void deleteSerial(int serialid);
	 
	 public void updateSerial(Serial serial);
}
