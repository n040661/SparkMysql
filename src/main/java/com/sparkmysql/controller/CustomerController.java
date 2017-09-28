package com.sparkmysql.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.sql.SQLException;
import com.sparkmysql.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/getTableData", method=RequestMethod.GET)
	public @ResponseBody List<Map<String, Object>> getTableData() throws SQLException
{
	return customerService.getTableData();

}
}
