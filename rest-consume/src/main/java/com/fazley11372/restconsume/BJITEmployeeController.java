package com.fazley11372.restconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("bjit")
public class BJITEmployeeController {
    @Autowired
     private RestTemplate restTemplate;

    @GetMapping("/employee")
    public List<Object> getEmployees(){
        String url = "http://localhost:8080/employee";
        Object[] objects = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(objects);

    }



}
