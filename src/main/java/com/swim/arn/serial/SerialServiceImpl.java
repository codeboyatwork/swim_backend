package com.swim.arn.serial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.swim.arn.ASN.ASN;
import com.swim.arn.ASN.ASNRepository;

public class SerialServiceImpl implements SerialService {
	 @Autowired
	 private SerialRepository serialRepository;
	 
	 public void setASNRepository(SerialRepository serialRepository) {
		  this.serialRepository = serialRepository;
		 }
	
	public List<Serial> retrieveSerials() {
		Iterable<Serial> iterable =  serialRepository.findAll();
		  List<Serial> collection = new ArrayList<Serial>();
			for (Serial e : iterable) {
				collection.add(e);
			}
			return collection;		
	}

	
	public Serial getSerial(int serialId) {
		 Optional<Serial> optSerial = serialRepository.findById(serialId);		 
		  return optSerial.get();
	}

	
	public void saveSerial(Serial serial) {
		 if(serial.getSerialStatus()==null)
			 serial.setSerialStatus("In-Transit");
		 serialRepository.save(serial);	
	}

	
	public void deleteSerial(int serialid) {		
		
	}

	@Override
	public void updateSerial(Serial serial) {
		// TODO Auto-generated method stub
		
	}

}
