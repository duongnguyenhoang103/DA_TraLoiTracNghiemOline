package vn.com.dva.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-14T17:57:22")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, Long> id;
    public static volatile SingularAttribute<News, String> content;
    public static volatile SingularAttribute<News, String> title;
    public static volatile SingularAttribute<News, String> other;
    public static volatile SingularAttribute<News, Long> idUser;
    public static volatile SingularAttribute<News, String> dateCreate;

}