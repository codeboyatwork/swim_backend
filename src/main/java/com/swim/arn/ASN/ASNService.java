package com.swim.arn.ASN;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface ASNService {
	public List<ASN> retrieveASN();
	 
	 public ASN getASN(int id);
	 
	 public void saveASN(ASN asn);
	 
	 public void deleteASN(int id);
	 
	 public void updateASN(ASN asn);
}
