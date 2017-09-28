package com.sparkmysql.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CustomerService {

	public List<Map<String, Object>> getTableData() throws SQLException;
}
