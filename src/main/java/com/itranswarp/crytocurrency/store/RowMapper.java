package com.itranswarp.crytocurrency.store;

import java.sql.ResultSet;

public interface RowMapper {

	<T> T map(ResultSet rs) throws Exception;
}