package com.swim.arn.ASN;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swim.arn.serial.Serial;

@RestController
@ComponentScan("com.swim.arn.service")
public class ASNRestController {

	 @Autowired
	 private ASNService asnService;
	 
	 
	 
	 public void setEmployeeService(ASNService asnService) {
		  this.asnService = asnService;
		 }
	 
	 @GetMapping("/api/asns")
	 public List<ASN> getASNS() {
	  List<ASN> asns = asnService.retrieveASN();
	  return asns;
	 }
	 
	 @GetMapping("/api/asns/{id}")
	 public ASN getASN(@PathVariable(name="id")int id) {
	  return asnService.getASN(id);
	 }
	 
	 @PostMapping("/api/asns")
	 public void saveASN(ASN asn){
		 asnService.saveASN(asn);
		 System.out.println("ASN Saved Successfully");
	 }
	 @DeleteMapping("/api/asns/{id}")
	 public void deleteEmployee(@PathVariable(name="id")int id){
		 asnService.deleteASN(id);
		 System.out.println("ASN Deleted Successfully");
	 }
	 
	 @PutMapping("/api/asns/{id}")
	 public void updateEmployee(@RequestBody ASN asn,
	   @PathVariable(name="id")int id){
	  ASN asn1 = asnService.getASN(id);
	  if(asn1 != null){
		  asnService.updateASN(asn);
	  }
	  
	 }
	 @PostMapping("/api/asns1")
	 public void saveASNAgain(@RequestBody Map<String, Object> payload){
		 System.out.println(payload);
		 ASN asn = new ASN();
		 asn.setAsnNumber(Long.parseLong(payload.get("asn").toString()));
		 asn.setVendorID(payload.get("vendorId").toString());
		 asn.setExpectedArrivalDate(payload.get("expectedArrivalDate").toString());
		 asn.setExpectedArrivalTime(payload.get("expectedArrivalTime").toString());
		 asnService.saveASN(asn);
		 
		 System.out.println(payload.get("serials").toString());
		 System.out.println(payload.get("serials").getClass());
		 int count=0;
		 //		 Serial[] serial = new Serial[5];
	 }
	 
}
