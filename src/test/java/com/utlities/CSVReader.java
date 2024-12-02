package com.utlities;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVReader {
    public static List<Map<String, String>> readCSV(String filePath) {
        List<Map<String, String>> recordsList = new ArrayList<>();

        try (Reader reader = new FileReader(filePath)) {
            CSVParser records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(reader);
            for (CSVRecord record : records) {
                Map<String, String> recordMap = new HashMap<>();
                record.toMap().forEach(recordMap::put);
                recordsList.add(recordMap);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recordsList;
    }
}
