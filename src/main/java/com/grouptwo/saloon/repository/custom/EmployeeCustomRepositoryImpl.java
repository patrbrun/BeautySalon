package com.grouptwo.saloon.repository.custom;

import com.grouptwo.saloon.model.Employee;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static io.micrometer.core.instrument.util.StringUtils.isNotBlank;

public class EmployeeCustomRepositoryImpl implements EmployeeCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findEmployeeByParams(String name, String job_title, String phone_num) {
        Query query = entityManager.createNativeQuery("" +
                        "SELECT *\n" +
                        "FROM EMPLOYEES \n" +
                        "WHERE true \n" +
                        (isNotBlank(name) ? "and lower(NAME) LIKE :name \n" : "") +
                        (isNotBlank(job_title) ? "and lower(JOB_TITLE) LIKE :job_title \n" : "") +
                        (isNotBlank(phone_num) ? "and PHONE_NUMBER=phone_num \n" : "")
                , Employee.class);

        if (isNotBlank(name)) {
            query = query.setParameter("name", "%" + name.toLowerCase() + "%");
        }
        if (isNotBlank(name)) {
            query = query.setParameter("job_title", "%" + job_title.toLowerCase() + "%");
        }
        if (isNotBlank(name)) {
            query = query.setParameter("phone_num", phone_num);
        }

        return (List<Employee>) query.getResultList();
    }
}