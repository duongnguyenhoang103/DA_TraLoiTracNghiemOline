package vn.com.dva.entities;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-14T17:57:22")
@StaticMetamodel(Exam.class)
public class Exam_ { 

    public static volatile SingularAttribute<Exam, Integer> numberQuestion;
    public static volatile SingularAttribute<Exam, Integer> NumberOfTest;
    public static volatile SingularAttribute<Exam, String> ExamName;
    public static volatile SingularAttribute<Exam, Long> SubjectID;
    public static volatile SingularAttribute<Exam, Calendar> DateStart;
    public static volatile SingularAttribute<Exam, Long> LevelID;
    public static volatile SingularAttribute<Exam, Long> UserID;
    public static volatile SingularAttribute<Exam, Calendar> DateEnd;
    public static volatile SingularAttribute<Exam, Integer> Times;
    public static volatile SingularAttribute<Exam, Integer> TotalOfTest;
    public static volatile SingularAttribute<Exam, Long> ExamID;

}