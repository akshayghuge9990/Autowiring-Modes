package com.BikkadIT.AutowiringModes.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDaoI{

	@Override
	public String getReportData() {
		String msg= "gatting date from OracleDB";
		return msg;
	}
	
	

}
