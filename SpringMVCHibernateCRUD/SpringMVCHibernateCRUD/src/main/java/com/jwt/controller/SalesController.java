package com.jwt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Sales;
import com.jwt.service.SalesService;

@Controller
public class SalesController {

	private static final Logger logger = Logger
			.getLogger(SalesController.class);

	public SalesController() {
		System.out.println("SalesController()");
	}

	@Autowired
	private SalesService salesService;


	@RequestMapping(value = "/addSales", method = RequestMethod.GET)
	public ModelAndView addSales(ModelAndView model) {
		Sales sales = new Sales();
		model.addObject("sales", sales);
		model.setViewName("addSales");
		return model;
	}

	@RequestMapping(value = "/saveSales", method = RequestMethod.POST)
	public ModelAndView saveSales(Model model,@ModelAttribute Sales sales) {
		if (sales.getOrderId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			salesService.addSales(sales);
		} else {
			//userService.updateEmployee(user);
		}
		return new ModelAndView("redirect:/filter");
	}
	
	@RequestMapping(value = "/filter", method = RequestMethod.GET)
	public ModelAndView getFilter(ModelAndView model) {
			//userService.login(user);
		Sales sales = new Sales();
		model.addObject("sales1", sales);
		model.setViewName("filter");
		return model;
	}

	
	@RequestMapping(value = "/getSales", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		String county = request.getParameter("county");
		List<Sales> sales = salesService.getSales(county);
		System.out.println("%%%%%"+sales.size());
		ModelAndView model = new ModelAndView("salesForm");
		model.addObject("sales", sales);
		model.setViewName("filter");
		return model;
	}

}