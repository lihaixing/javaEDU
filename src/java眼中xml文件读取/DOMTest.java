package java����xml�ļ���ȡ;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {
	// ��������
	public DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		return db;
	}
	// DOM�ļ���ȡ
	public void XMLRead() throws ParserConfigurationException, SAXException, IOException {
		// TODO �Զ����ɵķ������
		DocumentBuilder db = getDocumentBuilder();
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

	// DOM����xml�ļ�
	public void XMLWrite() throws ParserConfigurationException, TransformerException {
		DocumentBuilder db = getDocumentBuilder();
		Document document = db.newDocument();
		document.setXmlStandalone(true);
		// �������ڵ�
		Element bookstore = document.createElement("bookStore");
		// ���ڵ�����ӽڵ�
		Element book = document.createElement("book");
		// Ϊ�ڵ㴴������
		book.setAttribute("id", "1");

		Element name = document.createElement("name");
		name.setTextContent("С����");
		book.appendChild(name);

		bookstore.appendChild(book);
		document.appendChild(bookstore);
		// ����TransformerFactory����
		TransformerFactory tff = TransformerFactory.newInstance();
		// ����Transformer����
		Transformer tf = tff.newTransformer();
		// ���ñ�ǩ���У��������һ��
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		tf.transform(new DOMSource(document), new StreamResult(new File("G:/java_study/code/�ļ��������Ŀ¼/createXML.xml")));

	}

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DOMTest dt = new DOMTest();
		dt.XMLRead();
		dt.XMLWrite();
	}

}
