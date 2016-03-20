package com.beartech;

import com.beartech.mapping.WristbandMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

//TODO: check this into github
public class Main {

	private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
		WristbandMapping wristband = loadWristbandMapping();
		//TODO: see what the json object looks like after refactor
		List<String> positions = wristband.getPositions();
		positions.stream().forEachOrdered(workbook::createSheet);
		for (int i = 0; i < workbook.getNumberOfSheets(); ++i) {
			writeDataForSheet(workbook.getSheetAt(i));
		}
		FileOutputStream out = new FileOutputStream(new File("c:\\dev\\workbooks\\testWorkbook.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("file created.");
	}

	private static void writeDataForSheet(XSSFSheet sheet) {
		List<XSSFRow> rows = new ArrayList<>();
		rows.add(sheet.createRow(0));
		rows.add(sheet.createRow(1));
		rows.add(sheet.createRow(2));
		//TODO: get the data out of the json object
	}

	private static WristbandMapping loadWristbandMapping() throws Exception {
		File wristbandFile = new File("C:\\dev\\WristbandHelper\\wristbandConfigs\\proto1.json");
		return objectMapper.readValue(wristbandFile, WristbandMapping.class);
	}
}
