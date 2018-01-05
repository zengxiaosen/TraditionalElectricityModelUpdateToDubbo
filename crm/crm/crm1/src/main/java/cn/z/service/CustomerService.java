package cn.z.service;

import cn.z.pojo.BaseDict;
import cn.z.pojo.Customer;
import cn.z.pojo.QueryVo;

import java.util.List;

/**
 * Created by root on 18-1-4.
 */
public interface CustomerService {
    public List<BaseDict> findDictByCode(String code);

    public Customer findCustomerById(Long id);

    public void updateCustomerById(Customer customer);

    public List<Customer> findCustomerByVo(QueryVo vo);

    public Integer findCunstomerByVoCount(QueryVo vo);

    public void delCustomerById(Long id);
}
