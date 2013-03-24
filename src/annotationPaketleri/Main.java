package annotationPaketleri;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main { 
	
	public static void main(String[] args) {
		 	
	ApplicationContext context =new ClassPathXmlApplicationContext("resources/Spring-Module.xml");
		//Spring konfigürasyonlarının bulunduğu bean yolu

		SpringBean bean = (SpringBean) context.getBean("hello"); 
		//merhaba id li beanin bilgileri alınır.
		
		System.out.println(bean.getSonuc());	
	}
}

