package java����xml�ļ���ȡ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JDOMTest {
	static ArrayList<Books> booksList = new ArrayList<Books>();

	public static void main(String[] args) throws JDOMException, IOException {
		// books.xml�ļ���JDOM����
		SAXBuilder saxBuilder = new SAXBuilder();
		// ����������
		InputStream in = new FileInputStream("./src/java����xml�ļ���ȡ/books.xml");

		// ��������������������룬1�޸ı��룬2��InputStreamReader
		// InputStreamReader isr = new InputStreamReader(in, "UTF-8");

		// ͨ��build����,��xml�ļ����������浽
		Document document = saxBuilder.build(in);
		// ��ȡ���ڵ�
		Element rootElement = document.getRootElement();
		// ��ȡ�ӽڵ�
		List<Element> bookList = rootElement.getChildren();

		for (Element book : bookList) {
			Books bookEntity = new Books();

			System.out.println(bookList.indexOf(book));
			// ����
			List<Attribute> attrList = book.getAttributes();
			System.out.println("����" + book.getAttributeValue("id"));
			for (Attribute attr : attrList) {
				System.out.println(attr.getName() + ":" + attr.getValue());
				if (attr.getName().equals("id")) {
					bookEntity.setId(attr.getName());
				}
			}
			// �ӽڵ�
			List<Element> bookChilds = book.getChildren();
			for (Element child : bookChilds) {
				System.out.println(child.getName() + ":" + child.getValue());
				if (child.getName().equals("name")) {
					bookEntity.setName(child.getValue());
				}
				if (child.getName().equals("author")) {
					bookEntity.setAuthor(child.getValue());
				}
				if (child.getName().equals("year")) {
					bookEntity.setYear(child.getValue());
				}
				if (child.getName().equals("price")) {
					bookEntity.setPrice(child.getValue());
				}
				if (child.getName().equals("language")) {
					bookEntity.setLanguage(child.getValue());
				}
			}
			booksList.add(bookEntity);
			bookEntity = null;
			System.out.println(booksList);
			System.out.println(booksList.get(0).getName());
		}

	}

}
