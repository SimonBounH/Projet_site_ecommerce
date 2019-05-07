package com.intiformation.siteecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intiformation.siteecommerce.service.AdminCategorieService;
import com.intiformation.siteecommerce.service.BoutiqueServiceImpl;

@Controller
@RequestMapping("/adminCategoriesController*")
public class AdminCategoriesController {
	
	private AdminCategorieService adminCategorieService;
	
	@Autowired
	public void setAdminCategorieService(AdminCategorieService adminCategorieService) {
		this.adminCategorieService = adminCategorieService;
	}
	
	
	
	
	
	public String index() {
		return null;
	}

	public String saveCat() {
		return null;
	}
	
	public byte[] getPhoto() {
		return null;
	}
	
	public String suppCat() {
		return null;
	}
	
	public String editCat() {
		return null;
	}

}
