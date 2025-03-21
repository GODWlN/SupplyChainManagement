package org.jsp.supplychainmanagement.controller;
import java.util.List;

import org.jsp.supplychainmanagement.dto.ResponseStructure;
import org.jsp.supplychainmanagement.entity.Supplier;
import org.jsp.supplychainmanagement.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/jsp/supplier")
@RestController
public class SupplierController {
	
	@Autowired	
	private SupplierService supplierService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Supplier>> saveSupplier(@RequestBody Supplier supplier){
		return supplierService.saveSupplier(supplier);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Supplier>> getSupplierById(@PathVariable int id){
		return supplierService.getSupplierById(id);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Supplier>>> getAllSuppliers(){
		return supplierService.getAllSuppliers();
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Supplier>> updateSupplier(@RequestBody Supplier supplier){
		return supplierService.updateSupplier(supplier);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseStructure<Supplier>> deleteSupplier(@PathVariable int id){
		return supplierService.deleteSupplier(id);
	}
}
