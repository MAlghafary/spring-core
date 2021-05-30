package mutaz.code.springcode;

import jdk.internal.util.xml.impl.Input;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BannerLoader {
    private Resource banner;

    public void setBanner(Resource banner) {
        this.banner = banner;
    }

    @PostConstruct
    public void showBanner() throws IOException {
        InputStream inputStream = banner.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while (true){
            String line = reader.readLine();
            if(line == null){
                break;
            }
            System.out.println(line);
        }
        reader.close();
    }


}
