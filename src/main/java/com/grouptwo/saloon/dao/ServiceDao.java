package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Service;

public interface ServiceDao {
    Iterable<Service> listServices();

    void deleteService(Integer serviceId);

    Service getServiceById(Integer serviceId);

    Service save(Service service);
}
