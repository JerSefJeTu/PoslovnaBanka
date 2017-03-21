/***********************************************************************
 * Module:  PRAVNO.java
 * Author:  Aleksa
 * Purpose: Defines the Class PRAVNO
 ***********************************************************************/

import java.util.*;

/** @pdOid d9e09cec-aa1d-4c1b-b2cf-93bd098eb6b9 */
public class PRAVNO {
   /** @pdOid 73d96f6d-612a-4de4-a403-7efef705ae7c */
   public double ID_MESTA;
   /** @pdOid f1908000-98e8-4cca-b46e-483d355f5fcb */
   public java.lang.String ADRESA;
   /** @pdOid 176bf945-c230-45bc-8c86-f2d8e41f01bd */
   public java.lang.String TELEFON;
   /** @pdOid c961a338-f760-44b5-bc13-6b496ce8e717 */
   public java.lang.String FAX;
   /** @pdOid c64828c3-2e25-4c56-8ffb-365a7393c74f */
   public java.lang.String E_MAIL;
   /** @pdOid bfb39ab1-8351-43e0-a308-a68004b97ea1 */
   public java.lang.String NAZIV;
   /** @pdOid 073a8d84-6546-4152-ae64-32493f37a937 */
   public double PIB;
   /** @pdOid 5d4dffa9-9732-4b61-a8ad-e6de3538b3cc */
   public double MATICNI_BROJ;
   
   /** @pdRoleInfo migr=no name=DELATNOST assc=RELATIONSHIP_10 mult=1..1 side=A */
   public DELATNOST dELATNOST;
   /** @pdRoleInfo migr=no name=KLIJENT assc=INHERITANCE_1 mult=1..1 side=A */
   public KLIJENT kLIJENT;
   
   
   /** @pdGenerated default parent getter */
   public DELATNOST getDELATNOST() {
      return dELATNOST;
   }
   
   /** @pdGenerated default parent setter
     * @param newDELATNOST */
   public void setDELATNOST(DELATNOST newDELATNOST) {
      if (this.dELATNOST == null || !this.dELATNOST.equals(newDELATNOST))
      {
         if (this.dELATNOST != null)
         {
            DELATNOST oldDELATNOST = this.dELATNOST;
            this.dELATNOST = null;
            oldDELATNOST.removePRAVNO(this);
         }
         if (newDELATNOST != null)
         {
            this.dELATNOST = newDELATNOST;
            this.dELATNOST.addPRAVNO(this);
         }
      }
   }

}