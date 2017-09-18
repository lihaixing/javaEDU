package java����xml�ļ���ȡ;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO �Զ����ɵķ������
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse("./src/java����xml�ļ���ȡ/books.xml");
		NodeList bookList = document.getElementsByTagName("book");
		System.out.println(bookList.getLength());
		for (int i = 0; i < bookList.getLength(); i++) {
			Node book = bookList.item(i);
			// ����
			NamedNodeMap attrs = book.getAttributes();
			for (int j = 0; j < attrs.getLength(); j++) {
				Node attr = attrs.item(j);
				System.out.println("��������" + attr.getNodeName());
				System.out.println("����ֵ��" + attr.getNodeValue());
			}
			// ����
			Element book2 = (Element) bookList.item(i);
			String attrValue = book2.getAttribute("id");
			// ��ȡ�ӽڵ�,��ȡ�ӽڵ�ͽڵ�ֵ
			NodeList childNodes = book.getChildNodes();
			System.out.println(childNodes.getLength());
			for (int k = 0; k < childNodes.getLength(); k++) {
				if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
					System.out.println(
							childNodes.item(k).getNodeName() + ":" + childNodes.item(k).getFirstChild().getNodeValue());
					System.out.println(childNodes.item(k).getNodeName() + ":" + childNodes.item(k).getTextContent());
				}
			}
		}
	}

}
