package kr.co.greenart.testjson;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.ColumnType;

public class CsvTest {
	public static void main(String[] args) throws IOException {
		CsvSchema schema = new CsvSchema.Builder()
				.addColumn("name", ColumnType.STRING)
				.addColumn("age", ColumnType.NUMBER)
				.build().withHeader();
				// withHeadr csv파일에 헤더가 있다는 것을 알려주기 위함
		
		MappingIterator<Person> iter = new CsvMapper()
				.readerFor(Person.class)
				.with(schema)
				.readValues(new File("person.csv"));
		List<Person> list = iter.readAll();
		System.out.println(list);
	}
}
