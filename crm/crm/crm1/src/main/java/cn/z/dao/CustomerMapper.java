package cn.z.dao;

import cn.z.pojo.Customer;
import cn.z.pojo.QueryVo;

import java.util.List;

/**
 * Created by root on 18-1-4.
 */
public interface CustomerMapper {
    public List<Customer> findCustomerByVo(QueryVo vo);
    public Customer findCustomerById(Long id);
    public Integer findCustomerByVoCount(QueryVo vo);
    public void updateCustomerById(Customer customer);
    public void delCustomerById(Long id);
}
