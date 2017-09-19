package java����xml�ļ���ȡ;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4jTest {

	public void XMLRead() throws DocumentException {
		// ����SAXReader�Ķ���reader
		SAXReader reader = new SAXReader();
		// ��ȡdocument����
		Document document = reader.read(new File("./src/java����xml�ļ���ȡ/books.xml"));
		// ��ȡ���ڵ�
		Element bookStore = document.getRootElement();
		// ��ȡ������,��ȡ���ڵ��е���Ϣ
		Iterator it = bookStore.elementIterator();
		while (it.hasNext()) {
			Element book = (Element) it.next();
			// ��ȡbook��������������ֵ
			List<Attribute> bookAttrs = book.attributes();
			for (Attribute attr : bookAttrs) {
				System.out.println(attr.getName() + ":" + attr.getValue());
			}
			// �ӽڵ�
			Iterator child = book.elementIterator();
			while (child.hasNext()) {
				Element bookChild = (Element) child.next();
				System.out.println(bookChild.getName() + ":" + bookChild.getStringValue());
			}
		}
	}

	private void createXML() throws IOException {
		Document document = DocumentHelper.createDocument();
		// �������ڵ�rss
		Element rss = document.addElement("res");
		rss.addAttribute("version", "2.0");
		Element channel = rss.addElement("channel");
		Element title = channel.addElement("title");
		title.setText("<![������������]>");
		// ����Ư����ʽ
		OutputFormat format = OutputFormat.createPrettyPrint();
		// ���ñ���
		// format.setEncoding("GBK");

		// ����xml�ļ�
		File file = new File("G:/java_study/code/�ļ��������Ŀ¼/createDOM4jXML.xml");
		XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
		// �����Ƿ�ת�ƣ�Ĭ��true
		writer.setEscapeText(false);
		writer.write(document);
		writer.close();

	}

	public static void main(String[] args) throws DocumentException, IOException {
		DOM4jTest d4jt = new DOM4jTest();
		d4jt.XMLRead();
		d4jt.createXML();
	}

}
