package com.research.MarketAnalysis.schedular;

import com.research.MarketAnalysis.entity.ReportModel;
import com.research.MarketAnalysis.repository.ReportOperation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

@Service
public class ReadCsvService {
    @Autowired
    ReportOperation reportOperation;

    public  void processFile(){
        String fileLoc="/Users/balgovindsingh/Desktop/sury/search-data/New_Reports_Metadata.xlsx";
        try
        {
            FileInputStream file = new FileInputStream(new File(fileLoc));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);



            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext())
            {
                int count =0;
                ReportModel reportModel = new ReportModel();
                Row row = rowIterator.next();
                assignValues(row, reportModel, count);
/*                int start = row.getFirstCellNum();
                int last = row.getLastCellNum();

                String name = row.getCell(start)
                        .getRichStringCellValue().toString();

                System.out.println("!!!name@@"+ name);*/
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

/*                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType())
                    {
                        case STRING:
                            //System.out.print(cell.getStringCellValue() + " t");
                            if(cell.getStringCellValue().equalsIgnoreCase("Report TitletRepor")){

                            }
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                    }
                }*/
/*                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case CELL_TYPE_NUMERIC:
                            cell.get
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                    }
                }*/
                System.out.println("");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private  void assignValues(Row row, ReportModel reportModel, int count) {
        //reportModel.setS
        reportModel.setReportTitle(row.getCell(1).toString());
        reportModel.setReportCategory(row.getCell(2).toString());
        reportModel.setReportCode(row.getCell(3).toString());
        reportModel.setReportCode(row.getCell(4).toString());
        reportModel.setDateTime(row.getCell(5).toString());
        reportModel.setFormat(row.getCell(6).toString());
        reportModel.setAuthorName(row.getCell(7).toString());
        reportModel.setReportDescription(row.getCell(8).toString());
        reportModel.setTableofContents(row.getCell(9).toString());
        reportModel.setSingleUserPriceInUS(row.getCell(10).toString());
        reportModel.setMultiUserPriceInUS(row.getCell(11).toString());
        reportModel.setEnterPriceSiteLicensePriceInUs(row.getCell(11).toString());
       // System.out.println(count++);
        //System.out.println("--Report--"+reportModel);
        reportOperation.save(reportModel);

    }


    public static void main(String[] args) {
        ReadCsvService readCsvService = new ReadCsvService();
        readCsvService.processFile();
    }
}
