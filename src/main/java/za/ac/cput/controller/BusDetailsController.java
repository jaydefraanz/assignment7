package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Bus.BusDetails;
import za.ac.cput.Service.Bus.BusDetailsService;

import java.util.Set;

@RestController
@RequestMapping("/busdetails")
public class BusDetailsController {
    @Autowired
    @Qualifier("BusServiceImpl")
    private BusDetailsService service;

    @PostMapping("/create")
    @ResponseBody
    public BusDetails create(BusDetails busDetails)
    {
        return service.create(busDetails);
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        service.delete(id);
    }

}
