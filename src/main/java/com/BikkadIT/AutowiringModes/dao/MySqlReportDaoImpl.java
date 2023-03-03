package com.BikkadIT.AutowiringModes.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlReportDaoImpl implements ReportDaoI {

	@Override
	public String getReportData() {
		String msg= "Getting data for MySql Data Base";
		return msg;
	}

}
