/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2014                    */
/* Created on:     3/21/2017 7:26:25 PM                         */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('DNEVNO_STANJE_RACUNA') and o.name = 'FK_DNEVNO_S_RELATIONS_RACUN')
alter table DNEVNO_STANJE_RACUNA
   drop constraint FK_DNEVNO_S_RELATIONS_RACUN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('FIZICKO') and o.name = 'FK_FIZICKO_INHERITAN_KLIJENT')
alter table FIZICKO
   drop constraint FK_FIZICKO_INHERITAN_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('GASENJE_RACUNA') and o.name = 'FK_GASENJE__RELATIONS_RACUN')
alter table GASENJE_RACUNA
   drop constraint FK_GASENJE__RELATIONS_RACUN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('KLIJENT') and o.name = 'FK_KLIJENT_RELATIONS_MESTO')
alter table KLIJENT
   drop constraint FK_KLIJENT_RELATIONS_MESTO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MT10X') and o.name = 'FK_MT10X_DUZNIK_BANKA')
alter table MT10X
   drop constraint FK_MT10X_DUZNIK_BANKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MT10X') and o.name = 'FK_MT10X_POVERILAC_BANKA')
alter table MT10X
   drop constraint FK_MT10X_POVERILAC_BANKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('NALOG') and o.name = 'FK_NALOG_RELATIONS_DNEVNO_S')
alter table NALOG
   drop constraint FK_NALOG_RELATIONS_DNEVNO_S
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('NALOG') and o.name = 'FK_NALOG_RELATIONS_MT10X')
alter table NALOG
   drop constraint FK_NALOG_RELATIONS_MT10X
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PRAVNO') and o.name = 'FK_PRAVNO_INHERITAN_KLIJENT')
alter table PRAVNO
   drop constraint FK_PRAVNO_INHERITAN_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('PRAVNO') and o.name = 'FK_PRAVNO_RELATIONS_DELATNOS')
alter table PRAVNO
   drop constraint FK_PRAVNO_RELATIONS_DELATNOS
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('RACUN') and o.name = 'FK_RACUN_RELATIONS_KLIJENT')
alter table RACUN
   drop constraint FK_RACUN_RELATIONS_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('RACUN') and o.name = 'FK_RACUN_RELATIONS_BANKA')
alter table RACUN
   drop constraint FK_RACUN_RELATIONS_BANKA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('BANKA')
            and   type = 'U')
   drop table BANKA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DELATNOST')
            and   type = 'U')
   drop table DELATNOST
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('DNEVNO_STANJE_RACUNA')
            and   name  = 'RELATIONSHIP_5_FK'
            and   indid > 0
            and   indid < 255)
   drop index DNEVNO_STANJE_RACUNA.RELATIONSHIP_5_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DNEVNO_STANJE_RACUNA')
            and   type = 'U')
   drop table DNEVNO_STANJE_RACUNA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('FIZICKO')
            and   type = 'U')
   drop table FIZICKO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('GASENJE_RACUNA')
            and   name  = 'RELATIONSHIP_4_FK'
            and   indid > 0
            and   indid < 255)
   drop index GASENJE_RACUNA.RELATIONSHIP_4_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('GASENJE_RACUNA')
            and   type = 'U')
   drop table GASENJE_RACUNA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('KLIJENT')
            and   name  = 'RELATIONSHIP_11_FK'
            and   indid > 0
            and   indid < 255)
   drop index KLIJENT.RELATIONSHIP_11_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('KLIJENT')
            and   type = 'U')
   drop table KLIJENT
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MESTO')
            and   type = 'U')
   drop table MESTO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MT10X')
            and   name  = 'POVERILAC_FK'
            and   indid > 0
            and   indid < 255)
   drop index MT10X.POVERILAC_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MT10X')
            and   name  = 'DUZNIK_FK'
            and   indid > 0
            and   indid < 255)
   drop index MT10X.DUZNIK_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MT10X')
            and   type = 'U')
   drop table MT10X
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('NALOG')
            and   name  = 'RELATIONSHIP_14_FK'
            and   indid > 0
            and   indid < 255)
   drop index NALOG.RELATIONSHIP_14_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('NALOG')
            and   name  = 'RELATIONSHIP_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index NALOG.RELATIONSHIP_13_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('NALOG')
            and   type = 'U')
   drop table NALOG
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('PRAVNO')
            and   name  = 'RELATIONSHIP_10_FK'
            and   indid > 0
            and   indid < 255)
   drop index PRAVNO.RELATIONSHIP_10_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('PRAVNO')
            and   type = 'U')
   drop table PRAVNO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('RACUN')
            and   name  = 'RELATIONSHIP_2_FK'
            and   indid > 0
            and   indid < 255)
   drop index RACUN.RELATIONSHIP_2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('RACUN')
            and   name  = 'RELATIONSHIP_1_FK'
            and   indid > 0
            and   indid < 255)
   drop index RACUN.RELATIONSHIP_1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('RACUN')
            and   type = 'U')
   drop table RACUN
go

/*==============================================================*/
/* Table: BANKA                                                 */
/*==============================================================*/
create table BANKA (
   ID_BANKE             int                  not null,
   SIFRA_BANKE          numeric(3)           not null,
   NAZIV_BANKE          varchar(255)         not null,
   ADRESA_BANKE         varchar(255)         not null,
   TELEFON_BANKE        varchar(50)          not null,
   PIB                  numeric              not null,
   SWIFT_KOD            varchar(8)           not null,
   OBRACUNSKI_RACUN     varchar(18)          not null,
   constraint PK_BANKA primary key (ID_BANKE)
)
go

/*==============================================================*/
/* Table: DELATNOST                                             */
/*==============================================================*/
create table DELATNOST (
   ID_DELATNOSTI        numeric              not null,
   SIFRA_DELATNOSTI     numeric(5)           not null,
   NAZIV_DELATNOSTI     varchar(50)          not null,
   constraint PK_DELATNOST primary key (ID_DELATNOSTI)
)
go

/*==============================================================*/
/* Table: DNEVNO_STANJE_RACUNA                                  */
/*==============================================================*/
create table DNEVNO_STANJE_RACUNA (
   ID_DNEVNOG_STANJA    int                  not null,
   ID_RACUNA            numeric              not null,
   DATUM_               datetime             null,
   PRETHODNO_STANJE     money                null,
   PROMET_U_KORIST      money                null,
   STANJE_              money                null,
   NOVO_STANJE          money                null,
   constraint PK_DNEVNO_STANJE_RACUNA primary key (ID_DNEVNOG_STANJA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_5_FK                                     */
/*==============================================================*/




create nonclustered index RELATIONSHIP_5_FK on DNEVNO_STANJE_RACUNA (ID_RACUNA ASC)
go

/*==============================================================*/
/* Table: FIZICKO                                               */
/*==============================================================*/
create table FIZICKO (
   ID_KLIJENTA          int                  not null,
   ID_MESTA             numeric              null,
   ADRESA               varchar(60)          null,
   TELEFON              varchar(50)          null,
   FAX                  varchar(50)          null,
   E_MAIL               varchar(50)          null,
   IME                  varchar(255)         not null,
   PREZIME              varchar(255)         not null,
   JMBG                 numeric              not null,
   constraint PK_FIZICKO primary key (ID_KLIJENTA)
)
go

/*==============================================================*/
/* Table: GASENJE_RACUNA                                        */
/*==============================================================*/
create table GASENJE_RACUNA (
   ID_GASENJA           numeric              not null,
   ID_RACUNA            numeric              not null,
   DATUM_GASENJA        datetime             not null,
   PRENOS_NA_RACUN      varchar(18)          not null,
   constraint PK_GASENJE_RACUNA primary key (ID_GASENJA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_4_FK                                     */
/*==============================================================*/




create nonclustered index RELATIONSHIP_4_FK on GASENJE_RACUNA (ID_RACUNA ASC)
go

/*==============================================================*/
/* Table: KLIJENT                                               */
/*==============================================================*/
create table KLIJENT (
   ID_KLIJENTA          int                  not null,
   ID_MESTA             numeric              null,
   ADRESA               varchar(60)          null,
   TELEFON              varchar(50)          null,
   FAX                  varchar(50)          null,
   E_MAIL               varchar(50)          null,
   constraint PK_KLIJENT primary key (ID_KLIJENTA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/




create nonclustered index RELATIONSHIP_11_FK on KLIJENT (ID_MESTA ASC)
go

/*==============================================================*/
/* Table: MESTO                                                 */
/*==============================================================*/
create table MESTO (
   ID_MESTA             numeric              not null,
   POSTANSKI_BROJ       numeric              null,
   NAZIV                text                 null,
   constraint PK_MESTO primary key (ID_MESTA)
)
go

/*==============================================================*/
/* Table: MT10X                                                 */
/*==============================================================*/
create table MT10X (
   ID_PORUKE            int                  not null,
   ID_BANKE1            int                  not null,
   ID_BANKE2            int                  not null,
   DATUM_               datetime             not null,
   UKUPAN_IZNOS         money                not null,
   VRSTA_PORUKE         char(5)              not null 
      constraint CKC_VRSTA_PORUKE_MT10X check (VRSTA_PORUKE in ('MT102','MT103')),
   SWIFT_KOD1           varchar(8)           not null,
   SWIFT_KOD2           varchar(8)           not null,
   OBRACUNSKI_RACUN1    varchar(18)          not null,
   OBRACUNSKI_RACUN2    varchar(18)          not null,
   OBRADJENO            bit                  not null,
   constraint PK_MT10X primary key (ID_PORUKE)
)
go

/*==============================================================*/
/* Index: DUZNIK_FK                                             */
/*==============================================================*/




create nonclustered index DUZNIK_FK on MT10X (ID_BANKE2 ASC)
go

/*==============================================================*/
/* Index: POVERILAC_FK                                          */
/*==============================================================*/




create nonclustered index POVERILAC_FK on MT10X (ID_BANKE1 ASC)
go

/*==============================================================*/
/* Table: NALOG                                                 */
/*==============================================================*/
create table NALOG (
   ID_NALOGA            int                  not null,
   ID_PORUKE            int                  null,
   ID_DNEVNOG_STANJA    int                  null,
   RACUN_DUZNIKA        varchar(18)          null,
   RACUN_POVERIOCA      varchar(18)          null,
   POZIV_NA_BROJ_ZADUZENJA varchar(20)          null,
   POZIV_NA_BROJ_ODOBRENJA varchar(20)          null,
   MODEL_ZADUZENJA      numeric(2)           null,
   MODEL_ODOBRENJA      numeric(2)           null,
   IZNOS                decimal(15,2)        null,
   DUZNIK               varchar(255)         null,
   PRIMALAC             varchar(255)         null,
   SVRHA_PLACANJA       varchar(255)         null,
   DATUM_NALOGA         datetime             null,
   constraint PK_NALOG primary key (ID_NALOGA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/




create nonclustered index RELATIONSHIP_13_FK on NALOG (ID_DNEVNOG_STANJA ASC)
go

/*==============================================================*/
/* Index: RELATIONSHIP_14_FK                                    */
/*==============================================================*/




create nonclustered index RELATIONSHIP_14_FK on NALOG (ID_PORUKE ASC)
go

/*==============================================================*/
/* Table: PRAVNO                                                */
/*==============================================================*/
create table PRAVNO (
   ID_KLIJENTA          int                  not null,
   ID_DELATNOSTI        numeric              not null,
   ID_MESTA             numeric              null,
   ADRESA               varchar(60)          null,
   TELEFON              varchar(50)          null,
   FAX                  varchar(50)          null,
   E_MAIL               varchar(50)          null,
   NAZIV                text                 not null,
   PIB                  numeric              not null,
   MATICNI_BROJ         numeric              not null,
   constraint PK_PRAVNO primary key (ID_KLIJENTA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_10_FK                                    */
/*==============================================================*/




create nonclustered index RELATIONSHIP_10_FK on PRAVNO (ID_DELATNOSTI ASC)
go

/*==============================================================*/
/* Table: RACUN                                                 */
/*==============================================================*/
create table RACUN (
   BROJ_RACUNA          varchar(18)          null,
   ID_RACUNA            numeric              not null,
   ID_KLIJENTA          int                  not null,
   ID_BANKE             int                  not null,
   constraint PK_RACUN primary key (ID_RACUNA)
)
go

/*==============================================================*/
/* Index: RELATIONSHIP_1_FK                                     */
/*==============================================================*/




create nonclustered index RELATIONSHIP_1_FK on RACUN (ID_KLIJENTA ASC)
go

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/




create nonclustered index RELATIONSHIP_2_FK on RACUN (ID_BANKE ASC)
go

alter table DNEVNO_STANJE_RACUNA
   add constraint FK_DNEVNO_S_RELATIONS_RACUN foreign key (ID_RACUNA)
      references RACUN (ID_RACUNA)
go

alter table FIZICKO
   add constraint FK_FIZICKO_INHERITAN_KLIJENT foreign key (ID_KLIJENTA)
      references KLIJENT (ID_KLIJENTA)
go

alter table GASENJE_RACUNA
   add constraint FK_GASENJE__RELATIONS_RACUN foreign key (ID_RACUNA)
      references RACUN (ID_RACUNA)
go

alter table KLIJENT
   add constraint FK_KLIJENT_RELATIONS_MESTO foreign key (ID_MESTA)
      references MESTO (ID_MESTA)
go

alter table MT10X
   add constraint FK_MT10X_DUZNIK_BANKA foreign key (ID_BANKE2)
      references BANKA (ID_BANKE)
go

alter table MT10X
   add constraint FK_MT10X_POVERILAC_BANKA foreign key (ID_BANKE1)
      references BANKA (ID_BANKE)
go

alter table NALOG
   add constraint FK_NALOG_RELATIONS_DNEVNO_S foreign key (ID_DNEVNOG_STANJA)
      references DNEVNO_STANJE_RACUNA (ID_DNEVNOG_STANJA)
go

alter table NALOG
   add constraint FK_NALOG_RELATIONS_MT10X foreign key (ID_PORUKE)
      references MT10X (ID_PORUKE)
go

alter table PRAVNO
   add constraint FK_PRAVNO_INHERITAN_KLIJENT foreign key (ID_KLIJENTA)
      references KLIJENT (ID_KLIJENTA)
go

alter table PRAVNO
   add constraint FK_PRAVNO_RELATIONS_DELATNOS foreign key (ID_DELATNOSTI)
      references DELATNOST (ID_DELATNOSTI)
go

alter table RACUN
   add constraint FK_RACUN_RELATIONS_KLIJENT foreign key (ID_KLIJENTA)
      references KLIJENT (ID_KLIJENTA)
go

alter table RACUN
   add constraint FK_RACUN_RELATIONS_BANKA foreign key (ID_BANKE)
      references BANKA (ID_BANKE)
go

