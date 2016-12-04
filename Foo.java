public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
    yaml.setResources(new ClassPathResource("appConfig.yml"));
    propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
    return propertySourcesPlaceholderConfigurer;
}




import org.junit.Test;

public class SanityTest {
   @Test
   public void foo() {
//        parse manifest.yml
//        parse application.yml
//        parse spring-cloud.properties.example and check that the last part of the key is the value in application.yml AND in manifest-yml
   }
}
