package com.asher.controller;

import com.asher.entity.Customer;
import com.asher.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/delete")
    public void delete(int customer_id,HttpServletResponse response) throws IOException {
        int row = customerService.deleteCustomer(customer_id);
        response.sendRedirect("show.do");
    }

    /**
     * 修改
     * @param customer_id
     * @return
     */
    @RequestMapping("update")
    public ModelAndView update(@Param("customer_id")int customer_id){
        ModelAndView mav = new ModelAndView();
        Customer customer = customerService.queryCustomerById(customer_id);
        mav.setViewName("../../index");
        mav.addObject("customer",customer);
        return mav;
    }

    /**
     * 查询
     * @param response
     * @return
     */
    @RequestMapping("/show")
    public ModelAndView getAllCustomer(HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();

        List<Customer> customerList = customerService.getAllCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer.getFirst_name());
        }
        modelAndView.setViewName("show");
        modelAndView.addObject("customerList",customerList);
        return modelAndView;
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("/insertCustomer")
    public void insertCustomer(HttpServletResponse response,Customer customer) throws IOException {
        ModelAndView modelAndView = new ModelAndView();

        if (customer.getCustomer_id()==0){//添加
            int row = customerService.insertCustomer(customer);
        }else{//修改
            int row = customerService.updateCustomer(customer);
        }

        response.sendRedirect("show.do");
    }


}
