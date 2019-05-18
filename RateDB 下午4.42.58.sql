/*
 Navicat Premium Data Transfer

 Source Server         : loacl
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : RateDB

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 15/05/2019 13:00:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for DateInfo
-- ----------------------------
DROP TABLE IF EXISTS `DateInfo`;
CREATE TABLE `DateInfo` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `last_date_en` varchar(20) DEFAULT NULL,
  `last_date_cn` varchar(20) DEFAULT NULL,
  `ts` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for CountryInfo
-- ----------------------------
DROP TABLE IF EXISTS `CountryInfo`;
CREATE TABLE `CountryInfo` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `money_en` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `icon` varchar(10) DEFAULT NULL,
  `money_cn` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of CountryInfo
-- ----------------------------
BEGIN;
INSERT INTO `CountryInfo` VALUES (1, '中国', 'CNY', 'cny_icon', '人民币');
INSERT INTO `CountryInfo` VALUES (2, '美国', 'USD', 'usd_icon', '美元');
INSERT INTO `CountryInfo` VALUES (3, '日本', 'JPY', 'jpy_icon', '日元');
INSERT INTO `CountryInfo` VALUES (4, '香港', 'HKD', 'hkd_icon', '港元');
INSERT INTO `CountryInfo` VALUES (5, '英国', 'GBP', 'gbp_icon', '英镑');
INSERT INTO `CountryInfo` VALUES (6, '澳大利亚', 'AUD', 'aud_icon', '澳元');
INSERT INTO `CountryInfo` VALUES (7, '新西兰', 'NZD', 'nzd_icon', '新西兰元');
INSERT INTO `CountryInfo` VALUES (8, '新加坡', 'SGD', 'sgd_icon', '新加坡元');
INSERT INTO `CountryInfo` VALUES (9, '瑞士', 'CHF', 'chf_icon', '瑞士法郎');
INSERT INTO `CountryInfo` VALUES (10, '加拿大', 'CAD', 'cad_icon', '加元');
INSERT INTO `CountryInfo` VALUES (11, '马来西亚', 'MYR', 'myr_icon', '马来西亚林吉特');
INSERT INTO `CountryInfo` VALUES (12, '俄罗斯', 'RUB', 'rub_icon', '俄罗斯卢布');
INSERT INTO `CountryInfo` VALUES (13, '韩国', 'KRW', 'krw_icon', '韩元');
INSERT INTO `CountryInfo` VALUES (14, '南非', 'ZAR', 'zar_icon', '南非兰特');
INSERT INTO `CountryInfo` VALUES (15, '阿联酋', 'AED', 'aed_icon', '阿联酋迪拉姆');
INSERT INTO `CountryInfo` VALUES (16, '匈牙利', 'HUF', 'huf_icon', '匈牙利福林');
INSERT INTO `CountryInfo` VALUES (17, '沙特', 'SAR', 'sar_icon', '沙特里亚尔');
INSERT INTO `CountryInfo` VALUES (18, '波兰', 'PLN', 'pln_icon', '波兰兹罗提');
INSERT INTO `CountryInfo` VALUES (19, '丹麦', 'DKK', 'dkk_icon', '丹麦克朗');
INSERT INTO `CountryInfo` VALUES (20, '瑞典', 'SEK', 'sek_icon', '瑞典克朗');
INSERT INTO `CountryInfo` VALUES (21, '挪威', 'NOK', 'nok_icon', '挪威克朗');
INSERT INTO `CountryInfo` VALUES (22, '土耳其', 'TRY', 'try_icon', '土耳其里拉');
INSERT INTO `CountryInfo` VALUES (23, '墨西哥', 'MXN', 'mxn_icon', '墨西哥比索');
INSERT INTO `CountryInfo` VALUES (24, '泰国', 'THB', 'thb_icon', '泰铢');
INSERT INTO `CountryInfo` VALUES (25, '欧盟', 'EUR', 'eur_icon', '欧元');
COMMIT;


-- ----------------------------
-- Table structure for AED_Money
-- ----------------------------
DROP TABLE IF EXISTS `AED_Money`;
CREATE TABLE `AED_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_AED` (`country_id`),
  KEY `ts_id_AED` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for AUD_Money
-- ----------------------------
DROP TABLE IF EXISTS `AUD_Money`;
CREATE TABLE `AUD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_AUD` (`country_id`),
  KEY `ts_id_AUD` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for CAD_Money
-- ----------------------------
DROP TABLE IF EXISTS `CAD_Money`;
CREATE TABLE `CAD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_CAD` (`country_id`),
  KEY `ts_id_CAD` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for CHF_Money
-- ----------------------------
DROP TABLE IF EXISTS `CHF_Money`;
CREATE TABLE `CHF_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_CHF` (`country_id`),
  KEY `ts_id_CHF` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DKK_Money
-- ----------------------------
DROP TABLE IF EXISTS `DKK_Money`;
CREATE TABLE `DKK_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_DKK` (`country_id`),
  KEY `ts_id_DKK` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for EUR_Money
-- ----------------------------
DROP TABLE IF EXISTS `EUR_Money`;
CREATE TABLE `EUR_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_eur` (`country_id`),
  KEY `ts_id_eur` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for GBP_Money
-- ----------------------------
DROP TABLE IF EXISTS `GBP_Money`;
CREATE TABLE `GBP_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_gbp` (`country_id`),
  KEY `ts_id_gbp` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for HKD_Money
-- ----------------------------
DROP TABLE IF EXISTS `HKD_Money`;
CREATE TABLE `HKD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_hkd` (`country_id`),
  KEY `ts_id_hkd` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for HUF_Money
-- ----------------------------
DROP TABLE IF EXISTS `HUF_Money`;
CREATE TABLE `HUF_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_HUF` (`country_id`),
  KEY `ts_id_HUF` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for JPY_Money
-- ----------------------------
DROP TABLE IF EXISTS `JPY_Money`;
CREATE TABLE `JPY_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_jpa` (`country_id`),
  KEY `ts_id_jpa` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for KRW_Money
-- ----------------------------
DROP TABLE IF EXISTS `KRW_Money`;
CREATE TABLE `KRW_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_KRW` (`country_id`),
  KEY `ts_id_KRW` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for MXN_Money
-- ----------------------------
DROP TABLE IF EXISTS `MXN_Money`;
CREATE TABLE `MXN_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_MXN` (`country_id`),
  KEY `ts_id_MXN` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for MYR_Money
-- ----------------------------
DROP TABLE IF EXISTS `MYR_Money`;
CREATE TABLE `MYR_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_MYR` (`country_id`),
  KEY `ts_id_MYR` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for NOK_Money
-- ----------------------------
DROP TABLE IF EXISTS `NOK_Money`;
CREATE TABLE `NOK_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_NOK` (`country_id`),
  KEY `ts_id_NOK` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for NZD_Money
-- ----------------------------
DROP TABLE IF EXISTS `NZD_Money`;
CREATE TABLE `NZD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_NZD` (`country_id`),
  KEY `ts_id_NZD` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for PLN_Money
-- ----------------------------
DROP TABLE IF EXISTS `PLN_Money`;
CREATE TABLE `PLN_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_PLN` (`country_id`),
  KEY `ts_id_PLN` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for RUB_Money
-- ----------------------------
DROP TABLE IF EXISTS `RUB_Money`;
CREATE TABLE `RUB_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_RUB` (`country_id`),
  KEY `ts_id_RUB` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for SAR_Money
-- ----------------------------
DROP TABLE IF EXISTS `SAR_Money`;
CREATE TABLE `SAR_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_SAR` (`country_id`),
  KEY `ts_id_SAR` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for SEK_Money
-- ----------------------------
DROP TABLE IF EXISTS `SEK_Money`;
CREATE TABLE `SEK_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_SEK` (`country_id`),
  KEY `ts_id_SEK` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for SGD_Money
-- ----------------------------
DROP TABLE IF EXISTS `SGD_Money`;
CREATE TABLE `SGD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_SGD` (`country_id`),
  KEY `ts_id_SGD` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for THB_Money
-- ----------------------------
DROP TABLE IF EXISTS `THB_Money`;
CREATE TABLE `THB_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_THB` (`country_id`),
  KEY `ts_id_THB` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for TRY_Money
-- ----------------------------
DROP TABLE IF EXISTS `TRY_Money`;
CREATE TABLE `TRY_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_TRY` (`country_id`),
  KEY `ts_id_TRY` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for USD_Money
-- ----------------------------
DROP TABLE IF EXISTS `USD_Money`;
CREATE TABLE `USD_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id` (`country_id`),
  KEY `ts_id_USD` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for User
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of User
-- ----------------------------
BEGIN;
INSERT INTO `User` VALUES (1, 'admin', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for ZAR_Money
-- ----------------------------
DROP TABLE IF EXISTS `ZAR_Money`;
CREATE TABLE `ZAR_Money` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `ts_id` int(64) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `china_rate` varchar(10) DEFAULT NULL,
  `rate_china` varchar(10) DEFAULT NULL,
  `country_id` int(4) DEFAULT NULL,
  `bp` varchar(10) DEFAULT NULL,
  `bpdouble` double(20,0) DEFAULT NULL,
  `vrtName` varchar(20) DEFAULT NULL,
  `vrtEName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_id_ZAR` (`country_id`),
  KEY `ts_id_ZAR` (`ts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
