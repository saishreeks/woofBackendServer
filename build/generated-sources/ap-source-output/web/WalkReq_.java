package web;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.OwnerDetails;
import web.WalkInfo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-12T16:00:05")
@StaticMetamodel(WalkReq.class)
public class WalkReq_ { 

    public static volatile SingularAttribute<WalkReq, Date> walkReqDate;
    public static volatile SingularAttribute<WalkReq, OwnerDetails> walkerId;
    public static volatile SingularAttribute<WalkReq, Integer> walkReqId;
    public static volatile SingularAttribute<WalkReq, WalkInfo> reqId;

}