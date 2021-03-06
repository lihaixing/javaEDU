package java眼中xml文件读取;

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

	private void createXML() throws IOException {
		Document document = DocumentHelper.createDocument();
		// 创建根节点rss
		Element rss = document.addElement("res");
		rss.addAttribute("version", "2.0");
		Element channel = rss.addElement("channel");
		Element title = channel.addElement("title");
		title.setText("<![国内最新新闻]>");
		// 创建漂亮格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		// 设置编码
		// format.setEncoding("GBK");

		// 生成xml文件
		File file = new File("G:/java_study/code/文件传输基础目录/createDOM4jXML.xml");
		XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
		// 设置是否转移，默认true
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
