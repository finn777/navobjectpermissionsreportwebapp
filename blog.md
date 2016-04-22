### NAVObjectPermissionsReportWebApp. О чудный, дивный мир…

https://blogs.technet.microsoft.com/alexef/2016/04/22/navobjectpermissionsreportwebapp/

>Хочу вернутся к старой теме разбивке объектов по гранулам.

В свое время у меня был пост по этой теме: Справочный файл по русской версии для "Find Granule", это еще по старой лицензионной туле. Потом на Partnersource появился полезный Excel файл (Object Permissions Report for Microsoft Dynamics NAV), писал про это: Dynamics NAV, как понять какие объекты входят в какие гранулы?.

В современное время решил снова вернутся к этой избитой теме.

##### Решил все посмотреть под разрезом нового веяния корпорации Microsoft по дружбе с Open Source и т.д.

> Да, да на сервисах, что предоставляются Azure *, можно найти кучу Open Source приложений и даже приложения конкурентов а-ля Oracle:

azure-virtual-machine-oracle

Так же есть свежий локальный сайт (корпорация поддерживает его, digital проект OSS on Azure) с вызывающим названием http://linuxloves.ru

##### linuxloves (!!!) О чудный, дивный мир…

вот еще инфа -

https://azure.microsoft.com/ru-ru/documentation/articles/virtual-machines-linux-opensource-links/

> *Azure - есть бесплатная 30-дневная подписка; если есть MSDN подписка, то там даже ~9000 рублей в месяц дают и есть возможность их потратить.

Ну в общем решил посмотреть Java и прочий сторонний мир…

##### В результате такой вот ученический проект:

https://github.com/finn777/navobjectpermissionsreportwebapp

Java (.jsp) + Tomcat (on Azure) + MySQL (on Azure)

И собственно само веб приложение
###### NAVObjectPermissionsReportWebApp: http://alexef0test0nav.azurewebsites.net/navobjectpermissionsreportwebapp-1/

Возможно кому будет полезно. Веб приложение по сути эмулирует то, что делает Excel файл.

> Файлу, что служил источником для загрузки данных в MySQL, после выкачивания делал Data Refresh, вероятно он отличается…

Возможно кому будет полезно.




###### Использовал из Azure:

> Marketplace (ClearDB MySQL Database) –

azure-marketplace-cleardb-mysql-database




> Web App (Apache Tomcat 8) –

azure-web-apps-appache-tomcat

azure-web-apps-appache-tomcat-webmatrix




> Т.е. общая картинка у меня такая (денег практически с моей MSDN подписки не списывает) –

azure-all-items




###### Литература –




Java и Web:

- http://www.javarush.ru/
- http://devcolibri.com/
- https://www.youtube.com/user/devcolibri/playlists
- http://java-course.ru/
- http://www.litres.ru/deniel-leuk/programmirovanie-na-java-8476071/
- http://books.ifmo.ru/book/931/setevoe_programmirovanie.htm
- http://htmlbook.ru/


Azure и Open Sources

- https://azure.microsoft.com
- http://linuxloves.ru
- https://azure.microsoft.com/ru-ru/documentation/articles/virtual-machines-linux-opensource-links/
- https://channel9.msdn.com/Series/Open-Source-Database-on-Microsoft-Azure/01
- https://www.microsoft.com/en-us/Openness
- https://portal.azure.com/ // новомодный интерфейс
- https://manage.windowsazure.com // классический интерфейс