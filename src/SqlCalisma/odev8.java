package SqlCalisma;

public class odev8 {
    public static void main(String[] args) {
        /*

1- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
2- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
3- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
4- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.



1- CREATE TABLE employee ( id SERIAL, name VARCHAR(50), birthday DATE, email VARCHAR(100) );

2-
insert into employee (name, birthday, email) values ('Conrado', '2010-07-12', 'cyetts0@xing.com');
insert into employee (name, birthday, email) values ('Kirbie', '2020-09-30', 'kperillio1@tripod.com');
insert into employee (name, birthday, email) values ('Osborn', '1992-06-04', 'ooccleshaw2@meetup.com');
insert into employee (name, birthday, email) values ('Delinda', '1988-06-17', 'dgersam3@gravatar.com');
insert into employee (name, birthday, email) values ('Jeremias', '1981-10-12', 'jaudrey4@bbb.org');
insert into employee (name, birthday, email) values ('Fraze', '1986-09-14', 'ftarborn5@ted.com');
insert into employee (name, birthday, email) values ('Cherice', '2021-06-17', 'ccellier6@ted.com');
insert into employee (name, birthday, email) values ('Avril', '2016-12-30', 'aperocci7@smh.com.au');
insert into employee (name, birthday, email) values ('Easter', '2001-11-27', 'emilhench8@xing.com');
insert into employee (name, birthday, email) values ('Michele', '2004-05-05', 'mbrantzen9@wikia.com');
insert into employee (name, birthday, email) values ('Honoria', '1998-04-25', 'hawtona@shareasale.com');
insert into employee (name, birthday, email) values ('Agace', '1987-01-19', 'amerrifieldb@histats.com');
insert into employee (name, birthday, email) values ('Fernandina', '2010-12-25', 'fbassilashvilic@a8.net');
insert into employee (name, birthday, email) values ('Kerwin', '2001-08-06', 'ktutingd@google.com.br');
insert into employee (name, birthday, email) values ('Howard', '1993-07-06', 'hallwoode@wiley.com');
insert into employee (name, birthday, email) values ('Arlyn', '2019-07-23', 'agossagef@apache.org');
insert into employee (name, birthday, email) values ('Egor', '2004-08-22', 'edeemg@soundcloud.com');
insert into employee (name, birthday, email) values ('Curtis', '1999-08-29', 'csimionescuh@studiopress.com');
insert into employee (name, birthday, email) values ('Efrem', '1997-01-08', 'emartineti@4shared.com');
insert into employee (name, birthday, email) values ('Ricki', '2000-05-13', 'rbecksj@cdbaby.com');
insert into employee (name, birthday, email) values ('Hubert', '2005-05-16', 'hpailk@ft.com');
insert into employee (name, birthday, email) values ('Yance', '1987-07-07', 'ybrightyl@edublogs.org');
insert into employee (name, birthday, email) values ('Lin', '2018-09-27', 'lmaccallionm@1und1.de');
insert into employee (name, birthday, email) values ('Lucilia', '1997-06-10', 'lmerceyn@t.co');
insert into employee (name, birthday, email) values ('Olly', '2001-03-08', 'oroberso@shinystat.com');
insert into employee (name, birthday, email) values ('Ashton', '2016-04-27', 'acheleyp@adobe.com');
insert into employee (name, birthday, email) values ('Cyndie', '1995-02-12', 'cjermynq@delicious.com');
insert into employee (name, birthday, email) values ('Jeremie', '1989-06-13', 'jrisebrowr@ihg.com');
insert into employee (name, birthday, email) values ('Vladimir', '2000-12-31', 'vsigsworths@bizjournals.com');
insert into employee (name, birthday, email) values ('Hastings', '1992-06-17', 'hmcellent@gmpg.org');
insert into employee (name, birthday, email) values ('Kalie', '2003-03-08', 'kmacnamarau@china.com.cn');
insert into employee (name, birthday, email) values ('Caz', '2011-09-25', 'cwrankmorev@angelfire.com');
insert into employee (name, birthday, email) values ('Peder', '1983-07-15', 'pcrockleyw@cyberchimps.com');
insert into employee (name, birthday, email) values ('Brandi', '2013-09-23', 'bshoremanx@microsoft.com');
insert into employee (name, birthday, email) values ('Cati', '2007-08-24', 'cspurgeony@nbcnews.com');
insert into employee (name, birthday, email) values ('Westley', '1984-05-13', 'wscottz@sakura.ne.jp');
insert into employee (name, birthday, email) values ('Rowney', '1981-06-26', 'rlambell10@smh.com.au');
insert into employee (name, birthday, email) values ('Lorilee', '1984-04-27', 'lfeldmann11@wikia.com');
insert into employee (name, birthday, email) values ('Town', '2021-08-22', 'tdunthorn12@samsung.com');
insert into employee (name, birthday, email) values ('Burr', '2001-10-09', 'baleswell13@com.com');
insert into employee (name, birthday, email) values ('Kari', '1994-07-15', 'kchaloner14@seesaa.net');
insert into employee (name, birthday, email) values ('Bobby', '1995-07-03', 'bstaples15@imageshack.us');
insert into employee (name, birthday, email) values ('Maynard', '1982-01-31', 'mdandrea16@discuz.net');
insert into employee (name, birthday, email) values ('Easter', '1989-03-31', 'ecarle17@toplist.cz');
insert into employee (name, birthday, email) values ('Hetti', '1996-06-23', 'htidbury18@ycombinator.com');
insert into employee (name, birthday, email) values ('Bern', '2001-02-23', 'bbiagi19@mozilla.org');
insert into employee (name, birthday, email) values ('Claudell', '1992-07-22', 'cduligall1a@pen.io');
insert into employee (name, birthday, email) values ('Giuditta', '2015-07-26', 'gdibb1b@de.vu');
insert into employee (name, birthday, email) values ('Lammond', '1998-09-16', 'llarsen1c@github.com');
insert into employee (name, birthday, email) values ('Hercules', '2014-03-24', 'hyaneev1d@senate.

3- UPDATE employee SET name = 'Barış' WHERE id < 6;

4- DELETE FROM employee WHERE id < 6;


         */
    }
}
