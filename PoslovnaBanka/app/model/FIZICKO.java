/***********************************************************************
 * Module:  FIZICKO.java
 * Author:  Aleksa
 * Purpose: Defines the Class FIZICKO
 ***********************************************************************/

import java.util.*;

/** @pdOid e7b1d034-a79d-4b00-a620-44a724ef6db9 */
public class FIZICKO {
   /** @pdOid 8680c59c-a728-4d58-bde1-85c86f3d997b */
   public double ID_MESTA;
   /** @pdOid db76831f-2e0e-4757-8c71-fee80a16c0dc */
   public java.lang.String ADRESA;
   /** @pdOid 3881b6b4-b43f-4c35-8c2c-4973b6a672ae */
   public java.lang.String TELEFON;
   /** @pdOid d70775a0-8bf3-499f-9044-6001525a4f3a */
   public java.lang.String FAX;
   /** @pdOid c47c769b-e2ee-48fd-b56b-2772b93c6fe6 */
   public java.lang.String E_MAIL;
   /** @pdOid 16efb59e-86cc-433b-a28c-c47d131e7ba8 */
   public java.lang.String IME;
   /** @pdOid e82b10f8-d3a7-4d2c-8f6a-f3f6295389df */
   public java.lang.String PREZIME;
   /** @pdOid 47f8e4a2-b3f0-4e99-b861-c79a172b49ce */
   public double JMBG;
   
   /** @pdRoleInfo migr=no name=KLIJENT assc=INHERITANCE_2 mult=1..1 side=A */
   public KLIJENT kLIJENT;

}