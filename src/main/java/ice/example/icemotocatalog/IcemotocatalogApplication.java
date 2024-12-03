package ice.example.icemotocatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IcemotocatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcemotocatalogApplication.class, args);
	}
    //DBの設定(mybatis)はまだしていないので、一度設定を無効にして後で設定


}
