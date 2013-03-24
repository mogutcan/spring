package annotationPaketleri;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello") //Spring Beanimize verdiðimiz id adý

public class SpringBean {

	@Value("#{hello.text}") //merhaba id li beandeki text parametresinin deðeri
	private String sonuc;
	private String text="Hello Spring";
	
	public void setSonuc(String sonuc) {
		this.sonuc = sonuc;
	}
	public String getSonuc() {
		return sonuc;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
}

