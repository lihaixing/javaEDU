package java����xml�ļ���ȡ;

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
	 * ��������xml�ļ��Ŀ�ʼ��ǩ
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO �Զ����ɵķ������
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")) {

			book = new Books();

			String value = attributes.getValue("id");
			System.out.println("book������ֵ��" + value);
			// �����֪����ʲô����
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("������Ϊ" + attributes.getQName(i));
				System.out.println("����ֵΪ" + attributes.getValue(i));

				if (attributes.getQName(i).equals("id")) {
					book.setId(attributes.getValue(i));
				}
			}
		} else if (!qName.equals("bookstore") && !qName.equals("sub")) {
			System.out.println(qName);
		}

	}

	/*
	 * ��������xml�ļ��Ľ�����ǩ
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO �Զ����ɵķ������
		super.endElement(uri, localName, qName);

		if (qName.equals("book")) {
			bookList.add(book);
			book = null;
			System.out.println("=========��������ĳ��Ԫ��");
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
	 * ������־������ʼ
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		super.startDocument();
		System.out.println("SAX������ʼ");
	}
	/*
	 * ������־��������
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		super.endDocument();
		System.out.println("SAX��������");
	}

	/* �ڵ����� */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO �Զ����ɵķ������
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
	}
}
