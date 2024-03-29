package com.duncan.apachepoipractice.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class SimpleWord {

	public void createBlankDocument(String name) throws IOException {
		// blank document
		XWPFDocument document = new XWPFDocument();

		// write the document to the file system
		FileOutputStream out = new FileOutputStream(
				new File("src/test/resources/officialReports/" + name));

		document.write(out);
		out.close();
	}
	
}
