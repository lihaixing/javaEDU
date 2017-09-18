package java眼中xml文件读取;

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
		// books.xml文件的JDOM解析
		SAXBuilder saxBuilder = new SAXBuilder();
		// 创建输入流
		InputStream in = new FileInputStream("./src/java眼中xml文件读取/books.xml");

		// 如果解析出的文字有乱码，1修改编码，2用InputStreamReader
		// InputStreamReader isr = new InputStreamReader(in, "UTF-8");

		// 通过build方法,将xml文件的输入流存到
		Document document = saxBuilder.build(in);
		// 获取根节点
		Element rootElement = document.getRootElement();
		// 获取子节点
		List<Element> bookList = rootElement.getChildren();

		for (Element book : bookList) {
			Books bookEntity = new Books();

			System.out.println(bookList.indexOf(book));
			// 属性
			List<Attribute> attrList = book.getAttributes();
			System.out.println("哈哈" + book.getAttributeValue("id"));
			for (Attribute attr : attrList) {
				System.out.println(attr.getName() + ":" + attr.getValue());
				if (attr.getName().equals("id")) {
					bookEntity.setId(attr.getName());
				}
			}
			// 子节点
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
