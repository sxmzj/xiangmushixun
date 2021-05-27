/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50701
Source Host           : localhost:3306
Source Database       : api

Target Server Type    : MYSQL
Target Server Version : 50701
File Encoding         : 65001

Date: 2021-05-24 18:02:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apihistory
-- ----------------------------
DROP TABLE IF EXISTS `apihistory`;
CREATE TABLE `apihistory` (
  `num` int(255) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apihistory
-- ----------------------------
INSERT INTO `apihistory` VALUES ('1', 'http://localhost:8080/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_滨江区', 'GET', '', '{\r\n    \"timestamp\": \"2021-05-24T08:35:32.291+00:00\",\r\n    \"status\": 400,\r\n    \"error\": \"Bad Request\",\r\n    \"message\": \"\",\r\n    \"path\": \"/common/getTransportFee\"\r\n}');

-- ----------------------------
-- Table structure for apitest
-- ----------------------------
DROP TABLE IF EXISTS `apitest`;
CREATE TABLE `apitest` (
  `No` varchar(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `GetUrl` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `opr` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apitest
-- ----------------------------
INSERT INTO `apitest` VALUES ('1', '登录', 'http://localhost:8080/api/login', 'post', '{ “phoneArea”:”88”, “phoneNumber”:”123456”, “password”:”223344” }', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('2', '获得地址', 'http://localhost:8080/api/address', 'get', '{}', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('3', '获取商品信息', 'http://localhost:8080/api/skulist?goodId=1', 'get', '{}', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('6', '提交订单', 'http://localhost:8080/api/orders/submit', 'post', '{ \"skuIds\":\"2\", \"skuNumbers\":\"1\", \"stockIds\":\"74966312\" }', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('7', '删除收货地址', 'http://localhost:8080/api/address/delete', 'post', '{\r\n\"id\":\"77243286\"}', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('8', '添加收货地址', 'http://localhost:8080/api/address/new', 'post', '\r\n\r\n\r\n{\r\n\"id\":\"2200\",\r\n\"receiverName\":\"huhu\",\r\n\"cellPhone\":\"2215\"\r\n}', '启用', '编辑  删除');
INSERT INTO `apitest` VALUES ('12', '登录', '接口测试', '不想挂科', '就给我', '启用', null);
INSERT INTO `apitest` VALUES ('4', '获得商品信息', 'http://localhost:8080/api/skulist?goodId=1', 'get', '{}', '启用', null);
INSERT INTO `apitest` VALUES ('5', '计算运费', 'http://localhost:8080/api/getTransportFee', 'get', '{}', '启用', null);

-- ----------------------------
-- Table structure for sss
-- ----------------------------
DROP TABLE IF EXISTS `sss`;
CREATE TABLE `sss` (
  `num` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sss
-- ----------------------------
