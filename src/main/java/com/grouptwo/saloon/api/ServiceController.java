package com.grouptwo.saloon.api;

import com.grouptwo.saloon.dao.ServiceDao;
import com.grouptwo.saloon.model.Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("services")
@Api(value = "saloon service")
public class ServiceController {
    private ServiceDao serviceDao;

    @Autowired
    public void setServiceDao(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @ApiOperation(value = "List all services offered", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Services retrieved successfully"),
            @ApiResponse(code = 401, message = "Authorization to view resource denied."),
            @ApiResponse(code = 403, message = "Access is forbidden"),
            @ApiResponse(code = 404, message = "Service absent")
    })

    @GetMapping("/list")
    public Iterable<Service> getAllService(Model model) {
        return serviceDao.listServices();
    }

    @ApiOperation(value = "Search service using ID", response = Service.class)
    @GetMapping("/find/{serviceId}")
    public Service searchService(@PathVariable Integer serviceId, Model model) {
        return serviceDao.getServiceById(serviceId);
    }

    @ApiOperation(value = "Save service")
    @PostMapping("/save")
    public ResponseEntity<String> saveService(@RequestBody Service service, Model model) {
        serviceDao.save(service);
        return new ResponseEntity<>("Service saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update service")
    @PutMapping(value = "/update/{serviceId}")
    public ResponseEntity<String> updateService(@PathVariable Integer serviceId, @RequestBody Service service) {
        Service serviceDetail = serviceDao.getServiceById(serviceId);
        serviceDetail.setDatePaid(service.getDatePaid());
        serviceDetail.setDiscount(service.getDiscount());
        serviceDetail.setPrice(service.getPrice());
        serviceDetail.setServiceName(service.getServiceName());
        // serviceDetail.setPayment(service.getPayment());
        return new ResponseEntity<>("Service updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "delete service")
    @DeleteMapping("/delete/{serviceId}")
    public ResponseEntity<String> deleteService(@PathVariable Integer serviceId, Model model) {
        serviceDao.deleteService(serviceId);
        return new ResponseEntity<>("service deleted successfully", HttpStatus.OK);
    }
}
