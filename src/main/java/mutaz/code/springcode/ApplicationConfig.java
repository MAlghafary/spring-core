package mutaz.code.springcode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

@Configuration
// check link for more deatils on this :
// https://www.baeldung.com/properties-with-spring
@PropertySource("classpath:discounts.properties")
public class ApplicationConfig {

    @Value("${endofyear.discount:0}")
    private double specialEndOfYearDiscount;

    // This tells Spring to search for the banner.txt file in the classpath and inject it.
    // Spring uses the preregistered property editor ResourceEditor to convert the file
    // definition into a Resource object before injecting it into the bean.
    @Value("classpath:banner.txt")
    private Resource banner;

    // Because the banner file is located in the Java classpath, the resource path starts with the
    // classpath: prefix. The previous resource path specifies a resource in the relative path
    // of the file system. You can specify an absolute path as well.
    //file:c:/shop/banner.txt

    // Besides support to load from a file system path or the classpath, a resource can also be loaded by
    //specifying a URL.
    //http://springrecipes.apress.com/shop/banner.txt

    // To access the resources from the code
    // Resource resource = new ClassPathResource("discounts.properties");
    // Properties props = PropertiesLoaderUtils.loadProperties(resource);
    // Resource resource = new FileSystemResource("c:/shop/banner.txt")
    // Resource resource = new UrlResource("http://www.apress.com/")
    @Bean
    public Double discount(){
        return specialEndOfYearDiscount;
    }

    @Bean
    public BannerLoader bannerLoader(){
        BannerLoader loader = new BannerLoader();
        loader.setBanner(banner);
        return loader;
    }

}
