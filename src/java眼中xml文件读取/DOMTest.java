package java眼中xml文件读取;

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
	// 公共方法
	public DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		return db;
	}
	// DOM文件读取
	public void XMLRead() throws ParserConfigurationException, SAXException, IOException {
		// TODO 自动生成的方法存根
		DocumentBuilder db = getDocumentBuilder();
		Document document = db.parse("./src/java眼中xml文件读取/books.xml");
		NodeList bookList = document.getElementsByTagName("book");
		System.out.println(bookList.getLength());
		for (int i = 0; i < bookList.getLength(); i++) {
			Node book = bookList.item(i);
			// 属性
			NamedNodeMap attrs = book.getAttributes();
			for (int j = 0; j < attrs.getLength(); j++) {
				Node attr = attrs.item(j);
				System.out.println("属性名：" + attr.getNodeName());
				System.out.println("属性值：" + attr.getNodeValue());
			}
			// 属性
			Element book2 = (Element) bookList.item(i);
			String attrValue = book2.getAttribute("id");
			// 获取子节点,获取子节点和节点值
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

	// DOM创建xml文件
	public void XMLWrite() throws ParserConfigurationException, TransformerException {
		DocumentBuilder db = getDocumentBuilder();
		Document document = db.newDocument();
		document.setXmlStandalone(true);
		// 创建根节点
		Element bookstore = document.createElement("bookStore");
		// 根节点添加子节点
		Element book = document.createElement("book");
		// 为节点创建属性
		book.setAttribute("id", "1");

		Element name = document.createElement("name");
		name.setTextContent("小王子");
		book.appendChild(name);

		bookstore.appendChild(book);
		document.appendChild(bookstore);
		// 创建TransformerFactory对象
		TransformerFactory tff = TransformerFactory.newInstance();
		// 创建Transformer对象
		Transformer tf = tff.newTransformer();
		// 设置标签换行，否则会是一行
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		tf.transform(new DOMSource(document), new StreamResult(new File("G:/java_study/code/文件传输基础目录/createXML.xml")));

	}

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, TransformerException {
		DOMTest dt = new DOMTest();
		dt.XMLRead();
		dt.XMLWrite();
	}

}
