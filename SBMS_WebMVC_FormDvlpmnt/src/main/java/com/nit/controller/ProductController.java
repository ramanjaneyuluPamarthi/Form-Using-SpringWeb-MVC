package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.entity.ProductEntity;
import com.nit.service.ProductService;


@Controller
@RequestMapping("/form")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/load")
	public String loadform(@ModelAttribute("prod") ProductEntity product) {
		return "index";
	}
	
	@PostMapping("/saveProduct")
	public String handleSubmitClick(@ModelAttribute("prod") ProductEntity product,Model model) {
		System.out.println(product);
		model.addAttribute("msg", "Products Saved Suucessfully!!!");
		productService.saveData(product);
		return "output";
	}
	
}
