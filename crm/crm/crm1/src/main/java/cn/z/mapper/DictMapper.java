package cn.z.mapper;

import cn.z.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DictMapper {

	
	public List<BaseDict> findDictByCode(String code);
}
