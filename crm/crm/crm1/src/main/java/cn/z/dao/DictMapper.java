package cn.z.dao;

import cn.z.pojo.BaseDict;

import java.util.List;

/**
 * Created by root on 18-1-4.
 */
public interface DictMapper {
    public List<BaseDict> findDictByCode(String code);
}
