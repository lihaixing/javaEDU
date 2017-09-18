package java眼中xml文件读取;

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
		// 创建SAXReader的对象reader
		SAXReader reader = new SAXReader();
		// 获取document对象
		Document document = reader.read(new File("./src/java眼中xml文件读取/books.xml"));
		// 获取根节点
		Element bookStore = document.getRootElement();
		// 获取迭代器,获取根节点中的信息
		Iterator it = bookStore.elementIterator();
		while (it.hasNext()) {
			Element book = (Element) it.next();
			// 获取book的属性名和属性值
			List<Attribute> bookAttrs = book.attributes();
			for (Attribute attr : bookAttrs) {
				System.out.println(attr.getName() + ":" + attr.getValue());
			}
			// 子节点
			Iterator child = book.elementIterator();
			while (child.hasNext()) {
				Element bookChild = (Element) child.next();
				System.out.println(bookChild.getName() + ":" + bookChild.getStringValue());
			}
		}
	}

}
