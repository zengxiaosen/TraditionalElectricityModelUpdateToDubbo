package cn.z.service;

import cn.z.mapper.CustomerMapper;
import cn.z.mapper.DictMapper;
import cn.z.pojo.BaseDict;
import cn.z.pojo.Customer;
import cn.z.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by root on 18-1-4.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private DictMapper dictMapper;
    @Autowired
    private CustomerMapper customerMapper;

    public List<BaseDict> findDictByCode(String code) {
        List<BaseDict> list = dictMapper.findDictByCode(code);
        return list;
    }

    public Customer findCustomerById(Long id) {
        Customer customer = customerMapper.findCustomerById(id);
        return customer;
    }

    public void updateCustomerById(Customer customer) {
        customerMapper.updateCustomerById(customer);
    }

    public List<Customer> findCustomerByVo(QueryVo vo) {
        List<Customer> list = customerMapper.findCustomerByVo(vo);
        return list;
    }

    public Integer findCunstomerByVoCount(QueryVo vo) {
        Integer count = customerMapper.findCustomerByVoCount(vo);
        return count;
    }

    public void delCustomerById(Long id){
        customerMapper.delCustomerById(id);
    }
}
