package ec.com.krugercorp.demosso.controller;

import ec.com.krugercorp.demosso.dao.Customer;
import ec.com.krugercorp.demosso.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/")
    public String index(){
        return "external";
    }

    @GetMapping("/customers")
    public String customers(Model model){
        addCustomers();
        Iterable<Customer> customers = customerDAO.findAll();
        model.addAttribute("customers", customers);
        //model.addAttribute("username",)
        return "customers";
    }

    private void addCustomers() {
        Customer customer1 = new Customer();
        customer1.setAddress("1111 foo blvd");
        customer1.setName("Foo Industries");
        customer1.setServiceRendered("Important services");
        customerDAO.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAddress("2222 bar street");
        customer2.setName("Bar LLP");
        customer2.setServiceRendered("Important services");
        customerDAO.save(customer2);

        Customer customer3 = new Customer();
        customer3.setAddress("33 main street");
        customer3.setName("Big LLC");
        customer3.setServiceRendered("Important services");
        customerDAO.save(customer3);
    }
}
