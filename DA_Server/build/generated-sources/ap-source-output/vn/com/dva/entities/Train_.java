package vn.com.dva.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-14T17:57:22")
@StaticMetamodel(Train.class)
public class Train_ { 

    public static volatile SingularAttribute<Train, Long> TrainID;
    public static volatile SingularAttribute<Train, Long> SubjectID;
    public static volatile SingularAttribute<Train, Long> LevelID;
    public static volatile SingularAttribute<Train, Long> UserID;
    public static volatile SingularAttribute<Train, Integer> Times;
    public static volatile SingularAttribute<Train, Integer> TotalQuestion;
    public static volatile SingularAttribute<Train, String> Date_Train;
    public static volatile SingularAttribute<Train, Double> Score;

}