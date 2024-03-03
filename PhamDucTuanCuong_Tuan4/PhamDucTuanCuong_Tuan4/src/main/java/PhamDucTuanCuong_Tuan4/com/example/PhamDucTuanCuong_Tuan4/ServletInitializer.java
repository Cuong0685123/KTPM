package PhamDucTuanCuong_Tuan4.com.example.PhamDucTuanCuong_Tuan4;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PhamDucTuanCuongTuan4Application.class);
	}

}
