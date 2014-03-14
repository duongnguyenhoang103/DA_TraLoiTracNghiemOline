package vn.com.dva.entities;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-14T17:57:22")
@StaticMetamodel(ResultExam.class)
public class ResultExam_ { 

    public static volatile SingularAttribute<ResultExam, Long> id;
    public static volatile SingularAttribute<ResultExam, Calendar> DateTest;
    public static volatile SingularAttribute<ResultExam, Integer> times;
    public static volatile SingularAttribute<ResultExam, Integer> star;
    public static volatile SingularAttribute<ResultExam, Long> UserID;
    public static volatile SingularAttribute<ResultExam, Double> Score;
    public static volatile SingularAttribute<ResultExam, Long> ExamID;
    public static volatile SingularAttribute<ResultExam, String> comments;

}