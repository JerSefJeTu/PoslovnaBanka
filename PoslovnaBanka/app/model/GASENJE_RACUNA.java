/***********************************************************************
 * Module:  GASENJE_RACUNA.java
 * Author:  Aleksa
 * Purpose: Defines the Class GASENJE_RACUNA
 ***********************************************************************/

import java.util.*;

/** @pdOid 5fe55157-aacd-4c41-8dab-3ce82b615a5b */
public class GASENJE_RACUNA {
   /** @pdOid fb858fe4-7328-4103-8c7b-33e6fc3a4000 */
   public double ID_GASENJA;
   /** @pdOid abc43550-004b-46ff-90b0-d7394263ded4 */
   public java.util.Date DATUM_GASENJA;
   /** @pdOid 2516498e-7c29-49ea-bb00-c87d273b6ec2 */
   public java.lang.String PRENOS_NA_RACUN;
   
   /** @pdRoleInfo migr=no name=RACUN assc=RELATIONSHIP_4 mult=1..1 side=A */
   public RACUN rACUN;

}