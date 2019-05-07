package com.intiformation.siteecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intiformation.siteecommerce.service.AdminProduitService;

@Controller
@RequestMapping("/adminProduitsController*")
public class AdminProduitsController {
	
	private AdminProduitService adminProduitService;

	@Autowired
	public void setAdminProduitService(AdminProduitService adminProduitService) {
		this.adminProduitService = adminProduitService;
	}
	
	
	
	
	
	public String index() {
		return null;
	}
	
	public String saveProd() {
		return null;
	}
	
	public byte[] photoCat() {
		return null;
	}
	
	public String suppProd() {
		return null;
	}
	
	public String editProd() {
		return null;
	}

}
