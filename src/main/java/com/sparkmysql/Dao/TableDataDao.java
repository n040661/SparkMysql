package com.sparkmysql.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TableDataDao {

	List<Map<String, Object>> getTableData() throws SQLException;

}
