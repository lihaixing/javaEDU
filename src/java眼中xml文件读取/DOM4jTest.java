package java����xml�ļ���ȡ;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4jTest {

	public static void main(String[] args) throws DocumentException {
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

}
