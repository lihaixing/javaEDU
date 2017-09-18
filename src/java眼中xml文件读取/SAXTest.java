package java眼中xml文件读取;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTest extends DefaultHandler {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		// 获取SAXParserFactory实例
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 通过factory获取SAXParser实例
		SAXParser parser = factory.newSAXParser();
		// 创建SAXParserHandler对象
		SAXParserHandler handler = new SAXParserHandler();
		parser.parse("./src/java眼中xml文件读取/books.xml", handler);
		System.out.println(handler.getBookList().size());
		for (Books book : handler.getBookList()) {
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println(book.getYear());
			System.out.println(book.getPrice());
			System.out.println(book.getLanguage());
			System.out.println(".....finish.....");
		}
	}
}
