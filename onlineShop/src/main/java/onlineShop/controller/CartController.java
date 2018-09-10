package onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import onlineShop.service.CartService;
import onlineShop.service.CustomerService;

@Controller
public class CartController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CartService cartService;
	
//	@RequestMapping(value="")
}
