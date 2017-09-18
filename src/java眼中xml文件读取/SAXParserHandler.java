package java眼中xml文件读取;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHandler extends DefaultHandler {
	Books book;
	String value;
	private ArrayList<Books> bookList = new ArrayList<Books>();

	public ArrayList<Books> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Books> bookList) {
		this.bookList = bookList;
	}

	/*
	 * 用来遍历xml文件的开始标签
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO 自动生成的方法存根
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")) {

			book = new Books();

			String value = attributes.getValue("id");
			System.out.println("book的属性值是" + value);
			// 如果不知道有什么属性
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("属性名为" + attributes.getQName(i));
				System.out.println("属性值为" + attributes.getValue(i));

				if (attributes.getQName(i).equals("id")) {
					book.setId(attributes.getValue(i));
				}
			}
		} else if (!qName.equals("bookstore") && !qName.equals("sub")) {
			System.out.println(qName);
		}

	}

	/*
	 * 用来遍历xml文件的结束标签
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO 自动生成的方法存根
		super.endElement(uri, localName, qName);

		if (qName.equals("book")) {
			bookList.add(book);
			book = null;
			System.out.println("=========结束遍历某个元素");
		} else if (qName.equals("name")) {
			book.setName(value);
		} else if (qName.equals("author")) {
			book.setAuthor(value);
		} else if (qName.equals("year")) {
			book.setYear(value);
		}else if (qName.equals("price")) {
			book.setPrice(value);
		} else if (qName.equals("language")) {
			book.setLanguage(value);
		}
	}
	/*
	 * 用来标志解析开始
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.startDocument();
		System.out.println("SAX解析开始");
	}
	/*
	 * 用来标志解析结束
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.endDocument();
		System.out.println("SAX解析结束");
	}

	/* 节点内容 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
	}
}
