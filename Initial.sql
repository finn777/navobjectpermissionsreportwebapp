CREATE DATABASE `navobjectpermissionsreportdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE navobjectpermissionsreportdb;

CREATE TABLE `data` (
  `DataID` int(11) NOT NULL AUTO_INCREMENT,
  `ModuleName` varchar(80) DEFAULT NULL,
  `ObjectType` varchar(80) DEFAULT NULL,
  `Description` varchar(80) DEFAULT NULL,
  `RangeFrom` int(20) DEFAULT NULL,
  `RangeTo` int(20) DEFAULT NULL,
  `Read` varchar(10) DEFAULT NULL,
  `Insert` varchar(10) DEFAULT NULL,
  `Modify` varchar(10) DEFAULT NULL,
  `Delete` varchar(10) DEFAULT NULL,
  `Execute` varchar(10) DEFAULT NULL,
  `ProductLine` varchar(80) DEFAULT NULL,
  `ModuleID` int(20) DEFAULT NULL,
  `VersionName` varchar(20) DEFAULT NULL,
  `ModuleID2` int(20) DEFAULT NULL,
  PRIMARY KEY (`DataID`)
) ENGINE=InnoDB AUTO_INCREMENT=649631 DEFAULT CHARSET=utf8;

TRUNCATE TABLE navobjectpermissionsreportdb.data;

LOAD DATA LOCAL INFILE 'C:\\Users\\alexef\\IdeaProjects\\ObjectPermissionsexternal_Utf8.csv' INTO TABLE navobjectpermissionsreportdb.data
FIELDS TERMINATED BY ';'
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES
(`ModuleName`,`ObjectType`,`Description`,`RangeFrom`,`RangeTo`,`Read`,`Insert`,`Modify`,`Delete`,`Execute`,`ProductLine`,`ModuleID`,`VersionName`,`ModuleID2`);


Database=as_3c46f80963eb451;Data Source=eu-cdbr-azure-west-d.cloudapp.net;User Id=b2db65b318d4e7;Password=a2879805

mysql://b2db65b318d4e7:a2879805@eu-cdbr-azure-west-d.cloudapp.net/as_3c46f80963eb451

CREATE DATABASE `as_3c46f80963eb451` /*!40100 DEFAULT CHARACTER SET utf8 */;
