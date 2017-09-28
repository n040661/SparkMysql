package com.sparkmysql.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkmysql.Dao.TableDataDao;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	TableDataDao tableDataDao;

	public List<Map<String, Object>> getTableData() throws SQLException {
	List<Map<String,Object>> sp=tableDataDao.getTableData();
		return sp;
	}

}
