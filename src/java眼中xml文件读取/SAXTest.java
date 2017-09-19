package java眼中xml文件读取;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTest extends DefaultHandler {

	public ArrayList<Books> XMLRead() throws ParserConfigurationException, SAXException, IOException {
		// 获取SAXParserFactory实例
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 通过factory获取SAXParser实例
		SAXParser parser = factory.newSAXParser();
		// 创建SAXParserHandler对象
		SAXParserHandler handler = new SAXParserHandler();
		parser.parse("./src/java眼中xml文件读取/books.xml", handler);
		System.out.println(handler.getBookList().size());

		return handler.getBookList();
	}

	public void createXML()
			throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException {
		ArrayList<Books> booklist = XMLRead();

		SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
		TransformerHandler handler = tff.newTransformerHandler();
		Transformer tf = handler.getTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");

		File file=new File("G:/java_study/code/文件传输基础目录/createSAXXML.xml");
		if (!file.exists()) {
			file.createNewFile();
		}
		Result result = new StreamResult(new FileOutputStream(file));

		handler.setResult(result);

		// 开始通过handler对象进行xml文件的读写
		handler.startDocument();
		AttributesImpl attr = new AttributesImpl();
		handler.startElement("", "", "bookstore", attr);
		// attr.clear();
		// attr.addAttribute("", "", "id", "", "1");
		// handler.startElement("", "", "book", attr);
		for (Books book : booklist) {
			attr.clear();
			attr.addAttribute("", "", "id", "", book.getId());
			handler.startElement("", "", "book", attr);
			attr.clear();
			handler.startElement("", "", "name", attr);
			handler.characters(book.getName().toCharArray(), 0, book.getName().length());
			handler.endElement("", "", "name");
			if (book.getYear() != null && !book.getYear().trim().equals("")) {
				attr.clear();
				handler.startElement("", "", "year", attr);
				handler.characters(book.getYear().toCharArray(), 0, book.getYear().length());
				handler.endElement("", "", "year");
			}
			handler.endElement("", "", "book");
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println(book.getYear());
			System.out.println(book.getPrice());
			System.out.println(book.getLanguage());
		}

		// handler.endElement("", "", "book");
		handler.endElement("", "", "bookstore");
		handler.endDocument();
	}

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException {
		SAXTest ST = new SAXTest();
		ArrayList<Books> booklist = ST.XMLRead();
		for (Books book : booklist) {
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println(book.getYear());
			System.out.println(book.getPrice());
			System.out.println(book.getLanguage());
			System.out.println(".....finish.....");
		}

		ST.createXML();

	}
}
