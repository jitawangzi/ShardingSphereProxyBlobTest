DROP TABLE IF EXISTS `data_record`;
CREATE TABLE `data_record` (
  `uuid` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `blob_data` blob,
  `int_data` int DEFAULT NULL,
  `short_data` smallint DEFAULT NULL,
  `byte_data` tinyint DEFAULT NULL,
  `boolean_data` tinyint(1) DEFAULT NULL,
  `string_data` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
