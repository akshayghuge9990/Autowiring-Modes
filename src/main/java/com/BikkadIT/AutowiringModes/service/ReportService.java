package com.BikkadIT.AutowiringModes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.BikkadIT.AutowiringModes.dao.MySqlReportDaoImpl;
import com.BikkadIT.AutowiringModes.dao.OracleReportDaoImpl;
import com.BikkadIT.AutowiringModes.dao.ReportDaoI;

@Service
public class ReportService {
	@Autowired
	private ReportDaoI reportDaoI;
	//private OracleReportDaoImpl reportDaoI;
	//private MySqlReportDaoImpl reportDaoI;
	
	
	public void generateReport() {
		String reportData = reportDaoI.getReportData();
		System.out.println(reportData);
		
		
	}

}
