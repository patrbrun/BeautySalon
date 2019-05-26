package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Service;
import com.grouptwo.saloon.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceDaoBean implements ServiceDao {
    private ServiceRepository serviceRepository;

    @Autowired
    public void setServiceRepository(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public Iterable<Service> listServices() {
        return serviceRepository.findAll();
    }

    @Override
    public void deleteService(Integer serviceId) {
        serviceRepository.deleteById(serviceId);
    }

    @Override
    public Service getServiceById(Integer serviceId) {
        return serviceRepository.findById(serviceId).orElse(null);
    }

    @Override
    public Service save(Service service) {
        return serviceRepository.save(service);
    }
}
