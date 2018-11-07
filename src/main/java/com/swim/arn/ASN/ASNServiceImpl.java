package com.swim.arn.ASN;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ASNServiceImpl implements ASNService{
	 @Autowired
	 private ASNRepository asnRepository;
	 
	 public void setASNRepository(ASNRepository asnRepository) {
		  this.asnRepository = asnRepository;
		 }
	 
	 public List<ASN> retrieveASN() {
		  Iterable<ASN> iterable =  asnRepository.findAll();
		  List<ASN> collection = new ArrayList<ASN>();
			for (ASN e : iterable) {
				collection.add(e);
			}
			return collection;		  
		 }
	 
	 public ASN getASN(int id)
	 {
		 Optional<ASN> optASN = asnRepository.findById(id);		 
		  return optASN.get();
	 }
	 
	 public void saveASN(ASN asn)
	 {
		 if(asn.getAsnStatus()==null)
			 asn.setAsnStatus("In-Transit");
		 asnRepository.save(asn);
	 }
	 
	 public void deleteASN(int id)
	 {
		 asnRepository.deleteById(id);
	 }
		 
	 public void updateASN(ASN asn) 
	 {
		 asnRepository.save(asn);
	 }
	 
	 
}
