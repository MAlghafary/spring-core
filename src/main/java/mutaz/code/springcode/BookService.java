package mutaz.code.springcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    private BookRepository bookRepository;
    private MailService mailService;

    // you can apply @Autowired on an array,list,or map
    // in the case of array , and list , all subclasses will be injected
    // in the case of map , the key will be the name of the bean ,
    // and the value will be the bean itself

    private A[] array;
    private List<A> list;
    private Map<String,A> map;

    // By default, autowiring by type will not work when there is more than one
    // bean with the compatible type in the IoC container and the property isn’t a group type
    // this will not work , since they are 2 beans of type A (B&C)
    // to solve this issue
    // 1- set one of them as @Primary and it will be injected
    // 2- use name injection, by naming the instance variable c ( the same name as the bean c )
    // in this case , c implementation will be injected
    // , this will not work if @Primary is defined
    // 3- use @Qualifier to set the name of the bean to be injected , for this to work
    // you need to set the bean name using @Component,@Service... or @Qualifier
    private A oneType;


    // adding @Autowired to the constructor will tell spring
    // to automatically inject a bean of type BookRepository
    // when creating this bean , so you don't have to do it
    // by handd

    //As of Spring Framework 4.3, if you have only a single constructor,
    // Spring will automatically use that
    //constructor for autowiring. In that case, you can omit the @Autowired annotation.
    @Autowired
    public BookService(BookRepository bookRepository,A[] array,List<A> list,Map<String,A> map, @Qualifier("C") A oneType){
        this.bookRepository = bookRepository;
        this.array = array;
        this.list = list;
        this.map = map;
        this.oneType = oneType;
    }

    // the same thing for setter injection
    // by default , autowired dependencies are required , and if spring can't
    // find them , it will through an exception , to make them optional,
    // you can set requred to false
    @Autowired(required = false)
    public void setMailService(MailService mailService){
        this.mailService = mailService;
    }

    public A[] getArray() {
        return array;
    }

    public List<A> getList() {
        return list;
    }

    public Map<String, A> getMap() {
        return map;
    }

    public A getOneType() {
        return oneType;
    }
}
